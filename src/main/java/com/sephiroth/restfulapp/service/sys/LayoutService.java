package com.sephiroth.restfulapp.service.sys;

import com.sephiroth.restfulapp.DTO.sys.Layout.NavigationInDTO;
import com.sephiroth.restfulapp.DTO.sys.Layout.NavigationOutDTO;

import java.util.List;

/**
 * @Author: 吴占超
 * @Description:
 * @Date: Create in 15:05 2018/6/8
 * @Modified By:
 */
public interface LayoutService {

    List<NavigationOutDTO> navigation(NavigationInDTO param);
}
