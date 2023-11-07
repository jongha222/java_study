class PersonalComputer {
    private Computer computer;
    private Monitor monitor;

    public void turnOn(Computer computer, Monitor monitor) {
        this.computer = computer;
        this.monitor = monitor;
        System.out.print(computer.turnOn());
        System.out.print(monitor.turnOn());
        System.out.print(computer.printInfo("i7","16GB", "2TB", "White", "500W"));
        System.out.print(monitor.printInfo("24","Black", "45"));
    }

}

class Computer {
    private String cpu;
    private String memory;
    private String hd;
    private String color;
    private String power;
    public String turnOn() {
        return "Turning on the computer.\n";
    }
    public String printInfo(String c, String m, String h, String co, String p) {
        cpu = c;
        memory = m;
        hd = h;
        color = co;
        power = p;
        return "The spec of the computer\n" + " CPU: Core " + cpu + "\n" + " Memory: " + memory + "\n" + " HDD: " + hd + "\n" + " Color: " + co + "\n" + " Power: " + p +"\n";
    }
}


class Monitor {
    private String monitorSize;
    private String color;
    private String power;
    public String turnOn(){
        return("Turning on the monitor.\n");
    }
    public String printInfo(String m, String co, String p) {
        monitorSize = m;
        color = co;
        power = p;
        return "The spec of the computer\n Size: " + m + " inch\n Color: " + co + "\n Power: " + p +"W";
    }
}


public class Homework5 {
    public static void main(String[] args) {
        PersonalComputer PC = new PersonalComputer();
        Computer computer = new Computer();
        Monitor monitor = new Monitor();
        PC.turnOn(computer,monitor);
    }
}