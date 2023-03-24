package string;


//Sir how to convert 3 string of 3 characters to 2d array of 3*3


class ConvertStringToArray {
    public static void main(String args[]) {
        String s1 = "hai";
        String s2 = "how";
        String s3 = "hru";

        // char arr[] = s1.toCharArray();

        int len = s1.length();
        char arr[] = new char[len];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = s1.charAt(i);
        }


    }
}