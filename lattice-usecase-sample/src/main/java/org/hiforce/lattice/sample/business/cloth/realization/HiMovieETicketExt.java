package org.hiforce.lattice.sample.business.cloth.realization;

import org.hifforce.lattice.annotation.Realization;
import org.hiforce.lattice.sample.business.cloth.HiMovieBusiness;
import org.hiforce.lattice.sample.usecase.eticket.sdk.BlankETicketTradeSDK;

/**
 * @author Rocky Yu
 * @since 2022/9/28
 */
@Realization(codes = HiMovieBusiness.CODE)
public class HiMovieETicketExt extends BlankETicketTradeSDK {

    @Override
    public Boolean isVoucherSupportMultiWriteOff() {
        return false;
    }
}
