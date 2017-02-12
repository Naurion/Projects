/**
 * Created by naurion on 11.02.17.
 */
public class JavaRushClass {
        public static void main(String[] args) {
            for (int i=0;i<10; i++ ){
                Zerg[] zerg = new Zerg[10];
                zerg[i] = new Zerg();
                zerg[i].name = "Zerg_N" + i;
                System.out.println(zerg[i].name);
            }

        }

        public static class Zerg {
            public String name;
        }

        public static class Protoss {
            public String name;
        }

        public static class Terran {
            public String name;
        }
   }


