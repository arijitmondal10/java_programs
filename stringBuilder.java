public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        // System.out.println(sb);

        //char at index 0
        // System.out.println(sb.charAt(0));

        //set char 
        // sb.setCharAt(0, 'S');
        // System.out.println(sb);

        //insert
        // sb.insert(0,'S');
        // System.out.println(sb);

        //insert in last or middle
        // sb.insert(5, 'a');
        // System.out.println(sb);

        //delete
        // sb.delete(5, 6);
        // System.out.println(sb);

        //delete multiplee
        // sb.delete(2, 4);
        // System.out.println(sb);


        //in normal string we use str = str+"e"...like that
        // sb.append("e");
        //  sb.append("l");
        //   sb.append("l");
        //    sb.append("o");
        //    System.out.println(sb);

           //length
        //    System.out.println(sb.length());


           for(int i= 0;i<sb.length()/2;i++){
            int front = i;
            int back = sb.length()-i-1;

            char frontchar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontchar);
           }

           System.out.println(sb);
    }
}
