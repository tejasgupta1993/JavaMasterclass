package com.company;

// All interfaces variables are public static final

interface Accessible {          // accessible to all classes of com.company package

        int SOME_CONSTANT = 100;
        public void methodA();          // All three methods are public
        void methodB();
        boolean methodC();
}
