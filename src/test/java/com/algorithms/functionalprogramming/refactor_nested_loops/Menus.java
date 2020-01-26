package com.algorithms.functionalprogramming.refactor_nested_loops;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * for() {
 *     for() {
 *         for() {
 *
 *         }
 *     }
 * }
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public final class Menus {
    
    private String menuName;
    private double menuPrice;
    
}

