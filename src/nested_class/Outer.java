package nested_class;

public class Outer {
    private static int count = 0;
    private int id;
    private String name;

    public Outer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Outer() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static class InnerStatic {
        private int x;
        private int y;

        public InnerStatic(int x, int y) {
            this.x = x;
            this.y = y;
            System.out.println(count);
        }

        public InnerStatic() {
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }

    public class Inner {
        private int x;
        private int y;

        public Inner(int x, int y) {
            this.x = x;
            this.y = y;
            System.out.println(count);
        }

        public Inner() {
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }
}















