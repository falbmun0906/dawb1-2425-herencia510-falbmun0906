class Gerente(val bonus: Double, val excentoImpuestos: Boolean = false, nombre: String, edad: Int, salarioBase: Double) : Empleado(salarioBase, porcentajeImpuestos, nombre, edad) {

    companion object {
        val porcentajeImpuestos: Double = 33.99
    }

    override fun calcularSalario(): Double {
        if (excentoImpuestos) {
            return salarioBase + bonus
        } else return salarioBase * (1 - (porcentajeImpuestos / 100)) + bonus
    }

    override fun toString(): String {
        return "${super.toString()}, Bonus: $bonus, Excento de impuestos: ${if (excentoImpuestos) "Sí" else "No"}"
    }

}