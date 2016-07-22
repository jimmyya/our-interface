package com.qg.service.impl;

import com.qg.dao.InterfaceDao;
import com.qg.entity.Interfaces;
import com.qg.service.InterfaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by CHEN on 2016/7/19.
 */
@Service
public class InterfaceServiceImpl implements InterfaceService{
    @Autowired
    private InterfaceDao interfaceDao;

    public List<Interfaces> queryBySystemId(int systemId) {
        return interfaceDao.queryBySystemId(systemId);
    }

    public List<Interfaces> queryByInterfaceName(String interfaceName) {
        return interfaceDao.queryByInterfacesName(interfaceName);
    }

    public Interfaces queryByInterfaceId(int interfaceId) {
        return interfaceDao.queryByInterfacesId(interfaceId);
    }

    public boolean deleteInterfaceById(int interfaceId) {
        return interfaceDao.deleteByInterfacesId(interfaceId);
    }

    public boolean modifyInterface(Interfaces interfaces) {
        return interfaceDao.modifyInterface(interfaces);
    }

    public boolean insertInterface(Interfaces interfaces) {
        return interfaceDao.insertInterface(interfaces);
    }

}
