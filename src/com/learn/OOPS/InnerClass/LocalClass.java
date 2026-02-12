package com.learn.OOPS.InnerClass;

class MessagePrinter {
    void printMessage(String message) {
        class Printer {
            void display() {
                System.out.println("Message: " + message);
            }
        }

        Printer printer = new Printer();
        printer.display();
    }
}

public class LocalClass {
    public static void main(String[] args) {
        MessagePrinter messagePrinter = new MessagePrinter();
        messagePrinter.printMessage("Hello, Local Class!");
    }
}

