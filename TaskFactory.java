package exercise2;

//public class TaskFactory {
//
//	public TaskFactory() {
//		// TODO Auto-generated constructor stub
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}

public class TaskFactory {
    public static Task createTask(String type, String time) {
        switch (type.toLowerCase()) {
            case "exercise": return new Task("Exercise", time);
            case "eat": return new Task("Eat", time);
            case "work": return new Task("Work", time);
            default: return new Task("General", time);
        }
    }
}

