/*
 * @fileoverview    {Piano} se encarga de realizar tareas específicas.
 *
 * @version         2.0
 *
 * @author          Dyson Arley Parra Tilano <dysontilano@gmail.com>
 *
 * @copyright       Dyson Parra
 * @see             github.com/DysonParra
 *
 * History
 * @version 1.0     Implementación realizada.
 * @version 2.0     Documentación agregada.
 */
package com.project.dev.wirelesspiano.struct;

import android.widget.ImageView;

import lombok.Data;

/**
 * TODO: Definición de {@code Piano}.
 *
 * @author Dyson Parra
 * @since 1.8
 */
//@AllArgsConstructor
//@Builder
@Data
//@NoArgsConstructor
public final class Piano {

    private int keyQuantity;                                                            // Cantidad de teclas del piano.
    private int C4;                                                                     // Número de tecla que es el do central del piano.
    private ImageView[] keys;                                                           // Teclas del piano.
    private byte[] status;                                                              // Estado de cada tecla del piano.
    private int instrumentId;                                                           // Id del instrumento con los sonidos de cada tecla del piano.

    /**
     * TODO: Definición de {@code Piano}.
     *
     * @param keyQuantity  indica la cantidad de teclas del piano.
     * @param C4           indica el número de do que será el do central.
     * @param instrumentId indica el número de instrumento con que sonará cada tecla.
     */
    public Piano(int keyQuantity, int C4, int instrumentId) {
        this.keyQuantity = keyQuantity;                                                 // Asigna valor a la cantidad de teclas.
        this.C4 = 4 + ((C4 - 1) * 12);                                                  // Asigna valor al do central.
        this.instrumentId = instrumentId;                                               // Asigna valor al id del instrumento.
        this.keys = new ImageView[keyQuantity];                                         // Inicializa el array con las teclas.
        this.status = new byte[keyQuantity];                                            // Inicializa el array con los estados de cada notas.
        this.status[0] = 2;                                                             // Marca el primer bit para que envíe peticiones de actualización de teclas.
    }

}
