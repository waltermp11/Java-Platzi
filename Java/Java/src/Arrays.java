public class Arrays {
    public static void main(String[] args) {

        String [] androidVersiones = new String [17];


        //Añadimos versiones, solo asignamos 4 valores de 17 espacios disponibles ✅✅

        androidVersiones [0] = "Apple Pie";
        androidVersiones [1] = "Bannana Bread";
        androidVersiones [2] = "Cupcake";
        androidVersiones [3] = "Donut";

      /*  for (int i = 0; i <= androidVersiones.length-1 ; i++) {
            System.out.println("Version de Android :" + androidVersiones[i]);
        }*/
        for (String androidVersion : androidVersiones){
            System.out.println(androidVersion);
        }

       // System.out.println(androidVersiones[1]);
        System.out.println("***********************************************************************\n");
        //Aca vamos a crear un array con dos columnas, primero van las filas que las columnas.
        String [][] cities = new String [4][2];
        cities   [0][0] = "Colombia";
        cities   [0][1] = "Medellin";
        cities   [1][0] = "Colombia";
        cities   [1][1] = "Bogota";
        cities   [2][0] = "Mexico";
        cities   [2][1] = "Guadalajara";
        cities   [3][0] = "Monterrey";
        cities   [3][1] = "Mexico";

        System.out.println("***********************************************************************\n");

        //Imprimiendo array de dos posiciones
        System.out.println("Recorriendo array de dos dimensiones ");
        /* for (int i = 0; i < cities.length; i++) {
            for (int j = 0; j < cities[i].length ; j++) {
                System.out.println(cities[i][j]);

            } */


            for (String[] pair :cities){

                for (String name : pair){
                    System.out.println(name);
                }
            }
        System.out.println("***********************************************************************\n");

        System.out.println("Cities 🏙️🏙️🏙️🏙️");

        System.out.println("Pais  " + cities[0][0]+ " y estamos en la ciudad de " + cities[0][1] );
        System.out.println("Pais " + cities[2][0] + " y estamos en la ciudad de " + cities[2][1]);

        String [][][][] animals = new String[2][3][2][2];
        animals [1][0][0][1] = "🙉";

        System.out.println("Mono " + animals [1][0][0][1]);
        }



    }


