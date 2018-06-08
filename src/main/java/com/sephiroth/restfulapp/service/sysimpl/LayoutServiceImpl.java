package com.sephiroth.restfulapp.service.sysimpl;

import com.sephiroth.restfulapp.DTO.sys.Layout.NavigationInDTO;
import com.sephiroth.restfulapp.DTO.sys.Layout.NavigationOutDTO;
import com.sephiroth.restfulapp.service.sys.LayoutService;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: 吴占超
 * @Description:
 * @Date: Create in 15:07 2018/6/8
 * @Modified By:
 */
@Data
@Service
public class LayoutServiceImpl implements LayoutService {

    /**
     * 获取导航
     * @param param
     * @return
     */
    @Override
    public List<NavigationOutDTO> navigation(NavigationInDTO param) {
        return null;
    }
}
