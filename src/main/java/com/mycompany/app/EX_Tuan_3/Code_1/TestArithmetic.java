package com.mycompany.app.EX_Tuan_3.Code_1;

public class TestArithmetic {
    public static class Node {
        public Node() {}
        public double eval() {
            System.out.println("Error: eval Node");
            return 0;
        }
    }
    public static class Binop extends Node {
        protected Node lChild, rChild;
        public Binop(Node l, Node r) {
            lChild = l;
            rChild = r;
        }
    }
    public static class Plus extends Binop {
        public Plus(Node l, Node r) {
            super(l, r);
        }
        public double eval() {
            return lChild.eval() + rChild.eval();
        }
    }
    public static class Const extends Node {
        private double value;
        public Const(double d) { value = d; }
        public double eval() { return value; }
    }

    // evaluate 1.1 + 2.2 + 3.3
    public static void main(String[] args) {
        Node n = new Plus(
            new Plus(
                new Const(1.1), new Const(2.2)),
            new Const(3.3));
        System.out.println(""+ n.eval());
    }
}
