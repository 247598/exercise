package exercise2;

//public class Task {
//
//	public Task() {
//		// TODO Auto-generated constructor stub
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}

public class Task {
    private String name;
    private String time; // format HH:MM

    public Task(String name, String time) {
        this.name = name;
        this.time = time;
    }

    public String getName() { return name; }
    public String getTime() { return time; }

    @Override
    public String toString() {
        return time + " - " + name;
    }
}
