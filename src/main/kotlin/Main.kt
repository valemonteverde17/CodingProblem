package org.example

abstract class Vehiculo(private var velocidad: Int) {

    fun obtenerVelocidad(): Int {
        return velocidad
    }

    fun establecerVelocidad(nuevaVelocidad: Int) {
        velocidad = nuevaVelocidad
    }

    abstract fun tipoCombustible(): String

    open fun arrancar() {
        println("El vehículo está arrancando")
    }
}

class Coche(velocidad: Int, private val marca: String) : Vehiculo(velocidad) {

    override fun tipoCombustible(): String {
        return "Gasolina"
    }

    override fun arrancar() {
        println("El coche $marca está arrancando")
    }

    fun mostrarDetalles() {
        println("Marca del coche: $marca, Velocidad: ${obtenerVelocidad()} km/h, Tipo de combustible: ${tipoCombustible()}")
    }
}

fun main() {
    val miCoche = Coche(110, "Kia")
    miCoche.establecerVelocidad(150)
    miCoche.mostrarDetalles()
    miCoche.arrancar()
}

