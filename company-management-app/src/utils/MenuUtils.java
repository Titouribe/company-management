package utils;

import java.util.List;

public class MenuUtils {


    private static final List<Integer> MAIN_MENU_OPTIONS = List.of(1, 2, 3);

    public static void printMainMenu() {
        System.out.println("""
                ** Bienvenido al menu de gestion empresarial **
                Por favor oprima:
                1. Para ingresar al menu de empresas.
                2. Para ingresar al menu de empleados.
                3. Para salir de la aplicación (todos los datos seran eliminados).
                
                """);
    }

    public static void printCompanyMenu() {
        System.out.println("""
                ** Bienvenido al menu de empresa **
                Por favor oprima:
                1. Para crear una empresa.
                2. Para listar las empresas.
                3. Ingresar empleado a una empresa.
                4. Obtener la cantidad de empleados de una empresa.
                5. Para volver al menu principal.
                
                """);
    }

    public static void printEmployeeMenu() {
        System.out.println("""
                ** Bienvenido al menu de empleado **
                Por favor oprima:
                1. Para crear un empleado.
                2. Para listar los empleados.
                3. Para volver al menu principal.
                
                """);
    }

    public static void validateMainMenuOption(int option) {
        if (!MAIN_MENU_OPTIONS.contains(option)) throw new RuntimeException("Ingreso una opción invalida, volviendo al menu principal.");
    }
}
