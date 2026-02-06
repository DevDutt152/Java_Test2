package oops;

public class shapePolymorphism {


      int area(int side) {
          return side * side;
      }
      int area(int len, int breadth){
          return len*breadth;
      }
      float area(int height, float base ){
          return 0.5f * height * base;
      }

      double area(float radi){
          return Math.PI * radi * radi ;
      }
      float area(float base, int height) {
          return base * height;
      }

  }

