public class PaymentSystem {
public static void main(String[] args) {
Payment p; // Parent reference
p = new CreditCardPayment();
p.pay(); // Output: Paying using Credit Card
p = new UPIPayment();
p.pay(); // Output: Paying using UPI
p = new NetBankingPayment();
p.pay(); // Output: Paying using Net Banking
// Adding a new payment type is easy
p = new CryptocurrencyPayment();
p.pay(); // Output: Paying using Cryptocurrency
}
}
// Parent class
class Payment {
void pay() {
System.out.println("Processing payment...");
}
}
// Subclass 1
class CreditCardPayment extends Payment {
void pay() {
System.out.println("Paying using Credit Card");
}
}
// Subclass 2
class UPIPayment extends Payment {
void pay() {
System.out.println("Paying using UPI");
}
}
// Subclass 3
class NetBankingPayment extends
Payment {
void pay() {
System.out.println("Paying using Net Banking");
}
}
// Example of adding a new payment type later
class CryptocurrencyPayment
extends Payment {
void pay() {
System.out.println("Paying using Cryptocurrency");
}
}
