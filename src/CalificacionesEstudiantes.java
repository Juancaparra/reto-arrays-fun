public class CalificacionesEstudiantes {
    public static void main(String[] args) {
        // Definimos los datos de los estudiantes
        String[] estudiantes = {"Ana", "Carlos", "Sofía", "David", "Elena"};
        String[] materias = {"Matemáticas", "Física", "Química", "Literatura", "Historia"};
        double[][] notas = {
                {8.5, 7.0, 9.0, 8.0, 7.5},  // Notas de Ana
                {7.0, 6.5, 8.0, 9.0, 8.5},  // Notas de Carlos
                {9.5, 9.0, 9.5, 8.5, 9.0},  // Notas de Sofía
                {6.0, 7.0, 7.5, 8.0, 7.0},  // Notas de David
                {8.0, 8.5, 7.5, 9.0, 8.5}   // Notas de Elena
        };

        // Mostramos la información de los estudiantes
        mostrarInformacionEstudiantes(estudiantes, materias, notas);

        // Calculamos y mostramos los promedios de cada estudiante
        calcularPromedios(estudiantes, notas);

        // Encontramos y mostramos al estudiante con el promedio más alto
        encontrarMejorEstudiante(estudiantes, notas);

        // Encontramos y mostramos la materia con el promedio más alto
        encontrarMejorMateria(materias, notas);
    }

    public static void mostrarInformacionEstudiantes(String[] estudiantes, String[] materias, double[][] notas) {
        System.out.println("Información de los estudiantes:");
        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println("Estudiante: " + estudiantes[i]);
            for (int j = 0; j < materias.length; j++) {
                System.out.println("  Materia: " + materias[j] + ", Nota: " + notas[i][j]);
            }
        }
    }

    public static void calcularPromedios(String[] estudiantes, double[][] notas) {
        System.out.println("\nPromedios de los estudiantes:");
        for (int i = 0; i < estudiantes.length; i++) {
            double suma = 0;
            for (int j = 0; j < notas[i].length; j++) {
                suma += notas[i][j];
            }
            double promedio = suma / notas[i].length;
            System.out.println("Estudiante: " + estudiantes[i] + ", Promedio: " + promedio);
        }
    }

    public static void encontrarMejorEstudiante(String[] estudiantes, double[][] notas) {
        double mejorPromedio = 0;
        String mejorEstudiante = "";
        for (int i = 0; i < estudiantes.length; i++) {
            double suma = 0;
            for (int j = 0; j < notas[i].length; j++) {
                suma += notas[i][j];
            }
            double promedio = suma / notas[i].length;
            if (promedio > mejorPromedio) {
                mejorPromedio = promedio;
                mejorEstudiante = estudiantes[i];
            }
        }
        System.out.println("\nEl estudiante con el promedio más alto es: " + mejorEstudiante + " con un promedio de " + mejorPromedio);
    }

    public static void encontrarMejorMateria(String[] materias, double[][] notas) {
        double[] sumaMaterias = new double[materias.length];
        for (int j = 0; j < materias.length; j++) {
            for (int i = 0; i < notas.length; i++) {
                sumaMaterias[j] += notas[i][j];
            }
        }
        double mejorPromedio = 0;
        String mejorMateria = "";
        for (int j = 0; j < materias.length; j++) {
            double promedio = sumaMaterias[j] / notas.length;
            if (promedio > mejorPromedio) {
                mejorPromedio = promedio;
                mejorMateria = materias[j];
            }
        }
        System.out.println("\nLa materia con el promedio más alto es: " + mejorMateria + " con un promedio de " + mejorPromedio);
    }
}

