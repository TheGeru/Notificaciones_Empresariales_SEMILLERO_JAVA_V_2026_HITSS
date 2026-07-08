# Sistema de Notificaciones Empresariales

Proyecto desarrollado como parte del semillero de Java de HITSS para poner en práctica los conceptos de Programación Orientada a Objetos y las características modernas de Java 21.

## Objetivo

Simular un sistema capaz de manejar diferentes tipos de notificaciones empresariales utilizando un diseño orientado a objetos, aplicando buenas prácticas de desarrollo.

## Conceptos aplicados

- Records
- Interfaces `sealed`
- Pattern Matching con `switch`
- Polimorfismo
- Encapsulación
- Constructores compactos
- Validación de datos mediante excepciones (`IllegalArgumentException`)
- Organización del código por responsabilidades

## Estructura del proyecto

- `Notification`: interfaz sellada que define la jerarquía de notificaciones.
- `EmailNotification`, `SmsNotification` y `PushNotification`: implementaciones mediante `record`.
- `NotificationProcessor`: procesa el arreglo de notificaciones y genera las estadísticas.
- `NotificationStatistics`: almacena y administra los contadores de cada tipo de notificación.
- `App`: punto de entrada de la aplicación.

## Resultado

El sistema identifica el tipo de cada notificación utilizando **Pattern Matching** en un `switch` moderno y muestra un resumen con la cantidad de notificaciones procesadas por cada categoría.