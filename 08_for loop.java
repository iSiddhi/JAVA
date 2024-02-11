for (statement 1; statement 2; statement 3) {
  // code block to be executed
}


for (int i = 0; i < 5; i++) {
  System.out.println(i);
}



for (int i = 0; i <= 10; i = i + 2) {
  System.out.println(i);
}


// Outer loop
for (int i = 1; i <= 2; i++) {
  System.out.println("Outer: " + i); // Executes 2 times
  
  // Inner loop
  for (int j = 1; j <= 3; j++) {
    System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
  }
} 
