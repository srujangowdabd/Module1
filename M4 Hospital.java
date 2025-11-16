public class Hospital {
public static void main(String[] args) {
Doctor d1 = new Doctor();
Doctor d2 = new Dentist();
Doctor d3 = new Cardiologist();
Doctor d4 = new Surgeon();
d1.consultationFee(); // Calls parent class method
d2.consultationFee(); // Calls Dentist class method
d3.consultationFee(); // Calls Cardiologist class method
d4.consultationFee(); // Calls Surgeon class method
}
}
// Parent class
class Doctor {
void consultationFee() {
System.out.println("General Doctor fee: ₹300");
}
}
// Child class 1
class Dentist extends Doctor {
@Override
void consultationFee() {
System.out.println("Dentist consultation fee: ₹500");
}
}
// Child class 2
class Cardiologist extends Doctor {
@Override
void consultationFee() {
System.out.println("Cardiologist consultation fee: ₹800");
}
}
// Child class 3
class Surgeon extends Doctor {
@Override
void consultationFee() {
System.out.println("Surgeon consultation fee: ₹1000");
}
}
