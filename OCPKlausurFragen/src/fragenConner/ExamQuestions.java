package run;

import java.io.*;
import java.nio.*;
import java.nio.file.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.*;
import java.sql.*;
import java.time.*;
import java.time.temporal.*;
import java.util.stream.*;

class StrMan {
   public static void doStuff(String s) {
      try {
         if(s == null) {
            throw new NullPointerException();
         }
      } finally {
         System.out.println("-finally-");
      }
      System.out.println("-doStuff-");
   }
}

class Product {
// interface Moveable {void move();}
// Moveable mProduct = new Moveable() {
//    void move() {};
// };
   String name;
   int qty;
   public String toString() {
      return name;
   }
   public Product(String name, int qty) {
      this.name = name;
      this.qty = qty;
   }
   static class ProductFilter {
      public static boolean isAvailable(Product p) {
         return p.qty >= 10;
      }
   }
}

enum Flags {
  TRUE, FALSE;

  Flags() {
      System.out.println("HELLO");
  }
}
class Computer {
   private abstract class Card {
   }

   private class SoundCard extends Card {
   }

   private Card sCard = new SoundCard();
}

//class Block {
// interface Moveable {
//    void move();
// }
// Moveable mProduct = new Moveable() { void move() {}};
// int bno;
// static class Counter {
//    int locator;
//    Counter() {
//       locator = bno;
//    }
// }
//}

class UserException extends Exception {
}

class AgeOutOfLimitException extends UserException {
}

class Sum extends RecursiveAction {
//line n1
   static final int THRESHOLD_SIZE = 3;
   int stIndex, lstIndex;
   int[] data;

   public Sum(int[] data, int start, int end) {
      this.data = data;
      this.stIndex = start;
      this.lstIndex = end;
   }

   protected void compute() {
      long id = Thread.currentThread().getId();
      int sum = 0;
      System.out.println(id + "| start: " + stIndex + ", end: " + lstIndex);
      if (lstIndex - stIndex <= THRESHOLD_SIZE) {
         for (int i = stIndex; i < lstIndex; i++) {
            sum += data[i];
            System.out.println(id + "| data[" + i + "]: " + data[i]);
            System.out.println(id + "| sum: " + sum);
         }
         System.out.println(id + "| " + sum);
      } else {
         ForkJoinTask other = new Sum(data, stIndex + THRESHOLD_SIZE, lstIndex);
         other.fork();
         new Sum(data, stIndex, Math.min(lstIndex, stIndex + THRESHOLD_SIZE)).compute();
         other.join();
      }
   }
}

public class ExamQuestions {
   public static void main(String[] args)
         throws IOException, InterruptedException, ExecutionException, UserException, AgeOutOfLimitException {
      
//    // Q9
//    ForkJoinPool fjPool = new ForkJoinPool ( );
//    int data [ ] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//    fjPool.invoke (new Sum (data, 0, data.length));

//    // Q11
//    Stream<List<String>> iStr = Stream.of(Arrays.asList("1", "John"), Arrays.asList("2", null));
//    Stream<String> nInSt = iStr.flatMapToInt((x) -> x.stream());
//    nInSt.forEach(System.out::print);

//    // Q12
//    Path file = Paths.get ("courses.txt");
//    Stream<String> fc = Files.lines (file);
//    fc.forEach (s -> System.out.println(s));
//    List<String> fc2 = Files.readAllLines(file);
//    fc2.stream().forEach (s -> System.out.println(s));

//    // Q18
//    Properties prop = new Properties ();
//    FileInputStream fis = new FileInputStream ("Message.properties");
//    prop.load(fis);
//    System.out.println(prop.getProperty("welcome1"));
//    System.out.println(prop.getProperty("welcome2", "Test"));//line n1
//    System.out.println(prop.getProperty("welcome3"));

//    // Q23
//    Path source = Paths.get ("/home/paul/desktop/log.txt");
//    Path destination = Paths.get(".");
//    Files.copy (source, destination);

//    // Q26
//    class Emp {
//       String fName;
//       String lName;
//
//       public Emp(String fn, String ln) {
//          fName = fn;
//          lName = ln;
//       }
//
//       public String getfName() {
//          return fName;
//       }
//
//       public String getlName() {
//          return lName;
//       }
//
//       @Override
//       public String toString() {
//          return "Emp [fName=" + fName + ", lName=" + lName + "]";
//       }
//
//
//    }
//    List<Emp> emp = Arrays.asList(
//          new Emp("John", "Smith"),
//          new Emp("Peter", "Sam"),
//          new Emp("Peter", "Tully"),
//          new Emp("Thomas", "Wale"));
//    emp.stream()
//    .sorted (Comparator.comparing(Emp::getfName).reversed().thenComparing(Emp::getlName))
//          .collect(Collectors.toList()).forEach(System.out::println);;

//    // Q 36
//    class Product {
//       int id;
//       int price;
//
//       public Product(int id, int price) {
//          this.id = id;
//          this.price = price;
//       }
//
//       public String toString() {
//          return id + ":" + price;
//       }
//    }
//    List<Product> products = new ArrayList<>(Arrays.asList(
//          new Product(1, 10),
//          new Product(2, 30),
//          new Product(2, 30)));
//    Product p = products.stream().reduce(new Product(4, 0), (p1, p2) -> {
//       p1.price += p2.price;
//       return new Product(p1.id, p1.price);
//    });
//    products.add(p);
//    products.stream().parallel()
//       .reduce((p1, p2) -> p1.price > p2.price ? p1 : p2)
//       .ifPresent(System.out::println);

//    // Q 39
//    class Caller implements Callable<String> {
//       String str;
//
//       public Caller(String s) {
//          this.str = s;
//       }
//
//       public String call() throws Exception {
//          return str.concat("Caller");
//       }
//    }
//    class Runner implements Runnable {
//       String str;
//
//       public Runner(String s) {
//          this.str = s;
//       }
//
//       public void run() {
//          System.out.println(str.concat("Runner"));
//       }
//    }
//    ExecutorService es = Executors.newFixedThreadPool(2);
//    Future f1 = es.submit(new Caller("Call "));
//    Future f2 = es.submit(new Runner("Run "));
//    String str1 = (String) f1.get();
//    String str2 = (String) f2.get();
//    System.out.println(str1 + ":" + str2);

//    // Q85
//    class App {
//       public void doRegister(String name, int age) throws UserException, AgeOutOfLimitException {
//          if (name.length() < 6) {
//             throw new UserException();
//          } else if (age >= 60) {
//             throw new AgeOutOfLimitException();
//          } else {
//             System.out.println("User is registered.");
//          }
//       }
//
//       {
//          App t = new App();
//          t.doRegister("Mathew", 60);
//       }
//    }

//    // Q 86
//    Path p1 = Paths.get("/soft/.././sys/read.txt");
//    Path p2 = p1.normalize();
//    Path p3 = p1.relativize(p2);
//    System.out.println(p1 + " " + p2 + " " + p3);
//    System.out.println(p1.getNameCount() + " " + p2.getNameCount() + " " + p3.getNameCount());

//    // Q 87
//    List<Product> products = Arrays.asList(
//       new Product("MotherBoard", 5),
//       new Product("Speaker", 20)
//    );
//    products.stream()
//       .filter(Product.ProductFilter::isAvailable)
//       .forEach(System.out::println);

//    // Q 89
//    try {
//       StrMan.doStuff(null);
//    } catch (NullPointerException npe) {
//       System.out.println("-catch-");
//    }

//    // Q 91
//    try {
//       List<String> content = Files.readAllLines(Paths.get("employee.txt"));
//       content.stream().forEach(line -> {
//          try {
//                   Files.write(Paths.get("allemp.txt"),
//                   line.getBytes(),
//                   StandardOpenOption.APPEND); // file has to exist with APPEND option!
//          } catch (IOException e) {
//             System.out.println("E1");
//          }
//       });
//    } catch (IOException e) {
//       System.out.println("E2");
//    }

//    // Q92
//    class Job {
//       String name;
//       Integer cost;
//       public Job(String name, Integer cost) {
//          super();
//          this.name = name;
//          this.cost = cost;
//       }
//       public String getName() {
//          return name;
//       }
//       public int getCost() {
//          return cost;
//       }
//    }
//    Job j1 = new Job("IT", null);
//    DoubleSupplier js1 = j1::getCost;
//    System.out.println(j1.getName() + ":" + js1.getAsDouble());

//    // Q99
//    class Resource implements AutoCloseable {
//       public void close() throws Exception {
//          System.out.print("Close-");
//       }
//       public void open() {
//          System.out.print("Open-");
//       }
//    }
//    Resource res1 = new Resource();
//    try {
//       res1.open();
//       res1.close();
//    } catch (Exception e) {
//       System.out.println("E1");
//    }
//    try(res1 = new Resource()) {
//       res1.open();
//    } catch (Exception e) {
//       System.out.println("E2");
//    }

//    // Q 100
//    List<String> cs = Arrays.asList("Java", "Java EE", "Java ME");
//    boolean b = cs.stream().parallel().allMatch(s -> s.equals("Java"));
//    System.out.println(b);

//    // Q 101
//    final String str1 = "Java";
//    StringBuffer strBuf = new StringBuffer("Course");
//    UnaryOperator<String> u = (str2) -> str1.concat(str2);
//    UnaryOperator<String> c = (str3) -> str3.toLowerCase();
//    System.out.println(u.apply(c.apply(strBuf)));

//    // Q 107
//    Console console = System.console();
//    System.out.println(console);
//    char[] pass = console.readPassword("Password:");
//    String password = new String(pass);

//    // Q 117
//    List<String> vals = Arrays.asList("", "George", "", "John", "Jim");
//    Long newVal = vals.stream().filter(x -> !x.isEmpty()).count();
//    System.out.println(newVal);

//    // Q118
//    Instant time = Instant.now();
//    Thread.sleep(1000);
//    Instant time2 = Instant.now();
//    time = time.truncatedTo(ChronoUnit.MINUTES);
//    time2 = time2.truncatedTo(ChronoUnit.MINUTES);
//    System.out.println(time);
//    System.out.println(time2);
//    if(time2.isAfter(time))
//       System.out.println("after");
//    else
//       System.out.println("not");

//    // Q 119
//    List<String> words = Arrays.asList("win", "try", "best", "luck", "do");
//    Predicate<String> test = w -> {
//       System.out.println("Checking...");
//       return w.equals("do");
//    };
//    Predicate test2 = (w) -> w.length() > 3;

//    // Q 129
//    List<String> vals = Arrays.asList("EE", "SE");
//    System.out.println(vals.parallelStream().reduce("Java ", (a, b) -> a.concat(b)));

//    // Q 132
//    final List<String> list = new CopyOnWriteArrayList<>();
//    final AtomicInteger ai = new AtomicInteger(0);
//    final CyclicBarrier barrier = new CyclicBarrier(2, new Runnable() {
//       public void run() {
//          System.out.println(list);
//       }
//    });
//    Runnable r = new Runnable() {
//
//       @Override
//       public void run() {
//          try {
//             long time = 1000 * ai.incrementAndGet();
//             System.out.println(time);
//             Thread.sleep(time);
//             list.add("X");
//             barrier.await();
//          } catch(Exception e) {
//
//          }
//       }
//    };
//    new Thread(r).start();
//    new Thread(r).start();
//    new Thread(r).start();
//    new Thread(r).start();

//    // Q 133
//    Stream<Path> stream = Files.list(Paths.get("company"));
//    stream.forEach(System.out::println);
//    stream = Files.find(
//          Paths.get ("company"), 1,
//          (p,b) -> b.isDirectory (), FileVisitOption.FOLLOW_LINKS);
//    stream.forEach(System.out::println);

//    // Q 136
//    Deque<Integer> nums = new ArrayDeque<>();
//    nums.add(1000);
//    nums.push(2000);
//    nums.add(3000);
//    nums.push(4000);
//    Integer i1 = nums.remove();
//    Integer i2 = nums.pop();
//    System.out.println(i1 + " " + i2);

//    // Q 147
//    class ResourceApp {
//       public void loadResourceBundle() {
//          ResourceBundle resource = ResourceBundle.getBundle("Greetings", Locale.US);
//          System.out.println(resource.getString("hello_msg"));
//       }
//    }
//    new ResourceApp().loadResourceBundle();

//    // Q 148
//    class Testr {
//       List<String> list = null;
//       public void printValues() {
//          System.out.println(getList());
//       }
//       public List<String> getList() {
//          return list;
//       }
//       public void setList(List<String> newList) {
//          list = newList;
//       }
//    }
//    List<String> li = Arrays.asList("Dog", "Cat", "Mouse");
//    Testr t = new Testr();
//    t.setList(li.stream().collect(Collectors.toList()));
//    t.getList().forEach(Testr::printValues);

//    // Q 155
//    class Video {
//       public void play() throws IOException {
//          System.out.println("Video played.");
//       }
//    }
//    class Game extends Video {
//       public void play() throws Exception {
//          super.play();
//          System.out.println("Game played");
//       }
//    }

//    // Q 163
//    class Product {
//       int id;
//       int price;
//
//       public Product(int id, int price) {
//          this.id = id;
//          this.price = price;
//       }
//
//       public String toString() {
//          return id + ":" + price;
//       }
//    }
//    List<Product> products = new ArrayList<>(Arrays.asList(
//          new Product(1, 10),
//          new Product(2, 30),
//          new Product(3, 20)));
//    Product p = products.stream().reduce(new Product(4, 0), (p1, p2) -> {
//       p1.price += p2.price;
//       return new Product(p1.id, p1.price);
//    });
//    products.add(p);
//    products.stream().parallel()
//       .reduce((p1, p2) -> p1.price > p2.price ? p1 : p2)
//       .ifPresent(System.out::println);

//    Flags flags = Flags.FALSE;
//    Flags flags2 = Flags.FALSE;

//    ExecutorService es = Executors.newSingleThreadExecutor();
//    es.execute(() -> System.out.println("Run..."));
//    Future<String> f = es.submit(() -> "Call...");
//    System.out.println(f.get());

//    // Q 54
//    List<Integer> codes = Arrays.asList(10, 20);
//    UnaryOperator<Double> uo = s -> s + 10.0;
//    codes.replaceAll(uo);

//    // Q 63 (Exam)
//    class FuelNotAvailException extends Exception {}
//    class Vehicle {
//       void ride() throws Exception {
//          System.out.println("bla");
//       }
//    }
//    class SVehicle extends Vehicle {
//       public void ride() throws FuelNotAvailException {
//          super.ride();
//       }
//    }

//    // Q 79
//    List<Integer> list1 = Arrays.asList(10, 20);
//    List<Integer> list2 = Arrays.asList(15, 30);
//    Stream.of(list1, list2)
//       .flatMap(list -> list.stream())
//       .forEach(s -> System.out.print(s + " "));

//    // Q 112
//    LocalTime now = LocalTime.of(6, 30);
//    long timeToBreakfast = 0;
//    LocalTime office_start = LocalTime.of(6, 30);
//    if(office_start.isAfter(now)) {
//       timeToBreakfast = now.until(office_start, ChronoUnit.MINUTES);
//    } else {
//       timeToBreakfast = now.until(office_start, ChronoUnit.HOURS);
//    }
//    System.out.println(timeToBreakfast);

//    // Q 121
//    class MyClass implements AutoCloseable {
//       int test;
//       public void close() {}
//       public MyClass copyObject() {return this;}
//    }
//    MyClass obj = null;
//    try(MyClass obj1 = new MyClass()) {
//       obj1.test = 100;
//       obj = obj1.copyObject();
//    }
//    System.out.println(obj.test);
}