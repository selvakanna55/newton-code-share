package revision_dsa1;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class PowerSet {
    List<String> res = new ArrayList<>();

    void rec(int index, String s, String curr){
        if(index==s.length()){
            if(!curr.equals(""))
                res.add(curr);
            return;
        }
        rec(index+1, s, curr); // no pick
        rec(index+1, s, curr+s.charAt(index)); // pick
    }

    public List<String> AllPossibleStrings(String s){
        rec(0, s, "");
        Collections.sort(res);
        return res;
    }
}

