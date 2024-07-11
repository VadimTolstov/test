package zadachi.nasledovanie.two;

 class Pingvin extends Bird{
     public Pingvin(String name) {
         super(name);
   //      this.name = name;
     }

     @Override
     void eat() {
         System.out.println("Пингвин любит есть рыбу");
     }

     @Override
     void sleep() {
         System.out.println("Пингвины спят прислонившись друг к другу");
     }

     @Override
     void fly() {
         System.out.println("Пингвин не умеет летать");
     }

//     @Override
//     public void speak() {
//         System.out.println("Пингвины не умеют петь как соловьи ");
//     }
 }
