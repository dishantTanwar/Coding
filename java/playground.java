class playground {
    public static void main(String[] args) {
        String str = "A B C D E F G";
        int end = str.length();
        for (int i = str.length() - 1; i >= 0; i--) {

            if(str.charAt(i) == ' ') {
                System.out.print(str.substring(i+1, end) + " ");
                end = i;
            }
            if (i == 0) {
                System.out.println(str.substring(i, end));
            }
        }
    }   
}