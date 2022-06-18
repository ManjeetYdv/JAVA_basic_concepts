package com.company;

interface anime {
    void peak();       //by default public abstract
}
public class Interface_with_anonymous_class {
    public static void main(String[] args) {
        anime obj = new anime() {
                                    public void peak() {
                                    System.out.println("One piece peak fiction");
                                }
                            };
        obj.peak();
    }
}
