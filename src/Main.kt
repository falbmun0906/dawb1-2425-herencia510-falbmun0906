fun main() {
    val persona1: Persona = Persona("Antonio", 30)
    val empleado1: Empleado = Empleado(30000.0, 25.0, "María", 45)
    val gerente1: Gerente = Gerente(2500.0, true, "Estrella", 37, 34000.0)

    println("PERSONA:\n\t$persona1\n")
    println("EMPLEADO:\n\t$empleado1\n")
    println("GERENTE:\n\t$gerente1\n")
}