class Question2B {
  public static void main(String[] args) {
    System.out.println("Question 2b: ");
    String module = "CSC1009";
    switch(module)
    {
      case "CSC1009":
      System.out.println("Object-Oriented Programming");
      break;
      case "CSC1008":
      System.out.println("Data structures and algorithm");
      break;
      case "CSC1007":
      System.out.println("Operating systems");
      break;
      case "CSC1006":
      System.out.println("Mathematics 2");
      break;
      
      default:
      System.out.println("Unknown Module");
      break;
    }

  }
}