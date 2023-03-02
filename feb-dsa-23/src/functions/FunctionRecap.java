package functions;


class FunctionRecap {
    // public static return type functioname (){
    //  function body
    // }

    public static String giveMe(String y) {
        y = "Ok";
        return y;
    }

    public static void main(String[] args) {
        String x = null;
        x = giveMe(x);
        System.out.println(x);
    }
}