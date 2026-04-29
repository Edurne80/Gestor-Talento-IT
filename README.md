# Proyecto Gestor de Talento IT
**Autora:** Mª Nieves Garoz Pérez

## 🎯 Objetivo
Desarrollo de un sistema de gestión de nóminas para una consultora tecnológica. El software permite administrar una plantilla de programadores, calcular bonificaciones por desempeño técnico y persistir la información en formato de texto.

## 🚀 Funcionalidades
* **Cálculo de Bonos:** Lógica automatizada basada en el número de lenguajes dominados.
* **Gestión de Plantilla:** Uso de colecciones dinámicas para almacenamiento en memoria.
* **Persistencia:** Generación automática de archivos `.txt` con el resumen de nóminas.
* **Robustez:** Control de errores en la escritura de datos mediante excepciones.

## 🏗️ Arquitectura del Proyecto
* `Empleado`: Clase abstracta base.
* `Programador`: Clase hija con lógica específica de negocio.
* `GestionNominas`: Clase principal (Main) con el flujo de interacción.
