package cn.coolbhu.sfexpress.service;

import cn.coolbhu.sfexpress.model.Address;
import cn.coolbhu.sfexpress.vo.AddInfo;

import java.util.List;

/**
 * Created by lcyanxi on 17-5-28.
 */
public interface AddressService {

    /**
     * 添加收货人信息
     * @param addInfo
     * @return
     */
    int saveAddress(AddInfo addInfo);

    /**
     * 显示收货人信息
     * @return
     */
    List<Address> showAddress();

}