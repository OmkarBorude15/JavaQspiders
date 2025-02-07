class SwapToNumbers {
    public static void main(String[] args) {
        int a = 4;
        int b = 6;
        int temp = a;

        System.out.println("Number Before Swapping:");
        System.out.println("a: "+a);
        System.out.println("b: "+b);

        a= b;
        b= temp;
        System.out.println("After Swapping");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }
}
