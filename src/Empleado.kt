open class Empleado(val salarioBase: Double, val porcentajeImpuestos: Double, nombre: String, edad: Int) : Persona(nombre, edad) {

    open fun calcularSalario(): Double {
        return salarioBase * (1 - (porcentajeImpuestos / 100))
    }

    override fun toString(): String {
        return "${super.toString()}, Salario: ${"%.2f".format(calcularSalario())}"
    }

    fun trabajar() {
        println("$nombre está trabajando en la empresa.")
    }


}