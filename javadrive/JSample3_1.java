package javadrive;

class JSample3_1 {
    public static void main(String[] args) {
        outside: for(int i=1; i<5; i++) {
            for(int j=1; j<5; j++) {
                if (i * j > 10) {
                    break outside;
                }

                System.out.println(i + "*" + j + "=" + (i * j));
            }
        }
    }
}