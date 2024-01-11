public class Enumerations {


    public enum Day {

        MONDAY("Lunes");
        TUESDAY("Martes");
        WEDNESDAY("Miercoles");
        THURSDAY("Jueves");
        FRIDAY("Viernes");

        private String spanish;

        Day(String s) {
            spanish = s;
        }

        public String getSpanish() {
            return spanish;
        }
    }
}
