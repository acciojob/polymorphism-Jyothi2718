package com.driver;

public class Main {

    //static class  Product{
        public static class  Product{
            public int product(int x, int y){
                return x*y;
            }
            public int product(int x, int y, int z){
                return x*y*z;
            }
            public double product(double x, double y){
                return x*y;
            }
        }
        public static void main(String[] args) {
            Product p = new Product();
            p.product(4,2);
            p.product(3,5,3);
            p.product(1.5, 2.5);
        }
      }