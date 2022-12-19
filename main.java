public final class main {
 
    public static void main(String[] args) {
        
        Children children = new Children(3, null, null, 0, null);
        Mother mother = new Mother(2, null, null, 0, null);
        Father father = new Father(1, null, null, 0, null);
        Grandmother grandmother = new Grandmother(3, null, null, 0, null);
        Grandfather grandfather = new Grandfather(4, null, null, 0, null);
        FatherIn ob = new FatherIn();
        MatherIn ob1 = new MatherIn();
        // children.Hello();
        // mother.Hello();
        // father.Hello();
        // grandmother.Hello();
        // grandfather.Hello();
        System.out.println( ob.extracted());
        System.out.println( ob1.Hello2());
        children.getForce();
        children.getFlexibility();
    }



}
