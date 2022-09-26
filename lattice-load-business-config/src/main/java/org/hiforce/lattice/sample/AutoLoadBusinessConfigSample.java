package org.hiforce.lattice.sample;

import org.hiforce.lattice.LatticeOverlayProductSample;
import org.hiforce.lattice.runtime.Lattice;

/**
 * @author Rocky Yu
 * @since 2022/9/26
 */
public class AutoLoadBusinessConfigSample {

    public static void main(String[] args) {
        Lattice.getInstance().start();

        System.out.println("---------------------------------------");
        LatticeOverlayProductSample.doBusiness("groupBy");
        System.out.println("---------------------------------------");
    }
}
