import java.util.*;

class Post {
    private Integer id;
    private Integer time;
    private Post prev;
    private Post next;

    public Post() {

    }

    public Post(Integer id) {
        this.id = id;
        this.time = Facebook.timestamp++;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public Post getPrev() {
        return prev;
    }

    public void setPrev(Post prev) {
        this.prev = prev;
    }

    public Post getNext() {
        return next;
    }

    public void setNext(Post next) {
        this.next = next;
    }
}

class User {

    private Integer userId;
    private Set<Integer> followed;
    private Map<Integer, Post> postMap;
    private Post head;
    private Post tail;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Set<Integer> getFollowed() {
        return followed;
    }

    public void setFollowed(Set<Integer> followed) {
        this.followed = followed;
    }

    public Map<Integer, Post> getPostMap() {
        return postMap;
    }

    public void setPostMap(Map<Integer, Post> postMap) {
        this.postMap = postMap;
    }

    public Post getHead() {
        return head;
    }

    public void setHead(Post head) {
        this.head = head;
    }

    public Post getTail() {
        return tail;
    }

    public void setTail(Post tail) {
        this.tail = tail;
    }

    public User(Integer userId) {
        this.userId = userId;
        this.followed = new HashSet<>();
        follow(userId);
        this.postMap = new HashMap<>();
        this.head = new Post(-1);
        this.tail = new Post(-1);
        this.head.setPrev(null);
        this.tail.setNext(null);

        this.head.setNext(tail);
        this.tail.setPrev(head);
    }

    public void follow(Integer userId) {
        followed.add(userId);
    }

    public void unfollow(Integer userId) {
        followed.remove(userId);
    }
    /*
    -1 300 200 100 -1
     */

    public void createPost(Integer postId) {
        Post post = new Post(postId);
        postMap.put(postId, post);
        Post next = head.getNext();
        head.setNext(post);
        next.setPrev(post);

        post.setPrev(head);
        post.setNext(next);
    }

    public void deletePost(Integer postId) {
        Post post = postMap.get(postId);
        postMap.remove(postId);
        Post prev = post.getPrev();
        Post next = post.getNext();

        prev.setNext(next);
        next.setPrev(prev);
    }


}

public class Facebook {
    public static int timestamp;
    public static Map<Integer, User> userMap;
    public static Integer PAGE_SIZE;
    public static Integer FEED_SIZE;

    public Facebook() {
        timestamp = 0;
        userMap = new HashMap<>();
        PAGE_SIZE = 2;
        FEED_SIZE = 10;
    }

    public void createPost(Integer userId, Integer postId) {
        User user = userMap.get(userId);
        if (user == null) {
            user = new User(userId);
            userMap.put(userId, user);
        }
        user.createPost(postId);
        System.out.println("User " + userId + " posted " + postId);
    }

    public void deletePost(Integer userId, Integer postId) {
        User user = userMap.get(userId);
        if (user == null) {
            user = new User(userId);
            userMap.put(userId, user);
        }
        user.deletePost(postId);
        System.out.println("User " + userId + " deleted post " + postId);
    }

    public void follow(Integer userId, Integer followeeId) {
        User follower = userMap.get(userId);
        User followee = userMap.get(followeeId);
        if (follower == null) {
            follower = new User(userId);
            userMap.put(userId, follower);
        }
        if (followee == null) {
            followee = new User(followeeId);
            userMap.put(followeeId, followee);
        }
        follower.follow(followeeId);
        System.out.println("User " + userId + " followed User " + followeeId);
    }

    public void unfollow(Integer userId, Integer followeeId) {
        User follower = userMap.get(userId);
        User followee = userMap.get(followeeId);
        if (follower == null) {
            follower = new User(userId);
            userMap.put(userId, follower);
        }
        if (followee == null) {
            followee = new User(followeeId);
            userMap.put(followeeId, followee);
        }
        follower.unfollow(followeeId);
        System.out.println("User " + userId + " unfollowed User " + followeeId);
    }

    public void getNewsFeed(Integer userId) {
        List<Integer> feed = fetchTopNPosts(userId, FEED_SIZE);
        System.out.println("Feed for user " + userId);
        for (int i = 0; i < feed.size(); i++)
            System.out.println("Post " + (i + 1) + " " + feed.get(i));
    }

    public void getNewsFeedPaginated(Integer userId, Integer pageNumber) {
        User user = userMap.get(userId);
        if (user == null)
            return;
        List<Integer> feed = fetchTopNPosts(userId, Integer.MAX_VALUE);
        Integer start = pageNumber * PAGE_SIZE;
        Integer end = Math.min(start + PAGE_SIZE, feed.size());
        if (start > end)
            return;
        List<Integer> paginatedFeed = feed.subList(start, end);
        System.out.println("Page number " + pageNumber + " of user " + userId + " feed");
        for (int i = 0; i < paginatedFeed.size(); i++)
            System.out.println("Post " + (i + 1) + " " + paginatedFeed.get(i));
    }

    private List<Integer> fetchTopNPosts(Integer userId, int N) {
        User user = userMap.get(userId);
        if (user == null)
            return new LinkedList<>();
        int n = 0;
        List<Integer> posts = new LinkedList<>();
        Set<Integer> followed = user.getFollowed();
        PriorityQueue<Post> pq = new PriorityQueue<>((a, b) -> (b.getTime() - a.getTime()));
        for (Integer currUserId : followed) {
            User currUser = userMap.get(currUserId);
            Post head = currUser.getHead();
            Post tail = currUser.getTail();
            if (head.getNext() != tail)
                pq.add(head.getNext());
        }
        /*
        1-> 2,3,4,5
        2: -1 100(8) 200(7) -1
        3: -1 300(6) 400(1) -1
        4: -1 500(7) 600(0) -1
        5: -1 -1

        pq =  600

        output : 100, 200, 500, 300, 400, 600
         */
        while (!pq.isEmpty() && n < N) {
            Post curr = pq.poll();
            n++;
            posts.add(curr.getId());
            if (curr.getNext().getId() != -1)
                pq.add(curr.getNext());
        }
        return posts;
    }

    public static void main(String[] args) {
        Facebook facebook = new Facebook();
        facebook.follow(1, 2);
        facebook.follow(1, 3);
        facebook.follow(1, 4);
        facebook.follow(1, 5);
        facebook.follow(1, 6);
        facebook.follow(1, 7);
        facebook.follow(1, 8);
        facebook.follow(1, 9);
        facebook.follow(1, 10);
        facebook.follow(1, 11);
        facebook.follow(1, 12);
        facebook.follow(1, 13);
        facebook.createPost(1, 1000);
        facebook.createPost(2, 1002);
        facebook.createPost(3, 1003);
        facebook.createPost(4, 1004);
        facebook.createPost(5, 1005);
        facebook.createPost(6, 1006);
        facebook.createPost(7, 1007);
        facebook.createPost(8, 1008);
        facebook.createPost(9, 1009);
        facebook.createPost(10, 1010);
        facebook.createPost(11, 1011);
        facebook.createPost(12, 1012);
        facebook.createPost(13, 1013);
        facebook.getNewsFeed(1);
        facebook.unfollow(1, 13);
        facebook.getNewsFeed(1);
        facebook.deletePost(12, 1012);
        facebook.getNewsFeed(1);
        facebook.getNewsFeedPaginated(1, 2);
        facebook.getNewsFeedPaginated(1, 5);
    }
}