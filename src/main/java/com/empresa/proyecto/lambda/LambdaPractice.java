// Lambda Expressions
// Type-1
public void myName(){
  sysout("John");
}

public void (){
  sysout("John");
}

void (){
  sysout("John");
}

(){
  sysout("John");
}

() -> {
  sysout("John");
}

() -> sysout("John")

// Type-2
public void add(int a, int b){
  sysout(a+b);
}

public void (int a, int b){
  sysout(a+b);
}

void (int a, int b){
  sysout(a+b);
}

(int a, int b){
  sysout(a+b);
}

(int a, int b) -> {
  sysout(a+b);
}

(int a, int b) -> sysout(a+b)

(a, b) -> sysout(a+b)

// Type 3
public int length(String s){
  return s.length();
}

public int (String s){
  return s.length();
}

public (String s){
  return s.length();
}

(String s){
  return s.length();
}

(String s) -> {
  return s.length();
}

(String s) -> return s.length()

(s) -> s.length()