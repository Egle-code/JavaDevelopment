package com.company;

public class uzduotis7<grade> {
      public static void main(String[] args) {
          // write your code here
          for (int grade = 1; grade <= 10; grade++) {
            rodykIvertinima (grade);
          }
      }
    public static void rodykIvertinima(int grade){
                  switch (grade) {
                      case 10:
                          System.out.println("Super Star!" + grade);
                          break;
                      case 9:
                          System.out.println("Super" + grade);
                          break;
                      case 8:
                      case 7:
                          System.out.println("Hm, Not bad, " + grade);
                          break;
                      case 6:
                      case 5:
                          System.out.println("You passed, " + grade);
                          break;
                      case 4:
                          System.out.println("You failed, " + grade);
                          break;
                      default:
                          System.out.println("Invalid grade" + grade);
                  }

              }
          }

