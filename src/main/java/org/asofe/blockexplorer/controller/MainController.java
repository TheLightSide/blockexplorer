package org.asofe.blockexplorer.controller;

import org.asofe.blockexplorer.model.response.AddressMempool;
import org.asofe.blockexplorer.service.MemPools;
import org.asofe.blockexplorer.utils.Commands;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = {"/api/v1"})
public class MainController {

    @Autowired
    private Commands commands;

    @Autowired
    private MemPools memPools;

    // Create new user rig.
    @RequestMapping(value = "", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public boolean createUserRig() throws Throwable {
//        Block block = (Block) rpcDaemon.execute("getblock", new Object[]{"5000"}, Block.class);
        Object x = commands.getRawTransaction("485551c5f868c18206fade0495f515920ddecaec70811b021e71b3c5a98b8497");
        return true;
    }


    @RequestMapping(value = "getrawmempool", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public String[] getRawMempool() throws Throwable {
        return commands.getRawMempool();
    }

    @RequestMapping(value = "getaddressmempool", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public AddressMempool getAddressMempool(@RequestBody String[] addresses) throws Throwable {
        return memPools.getAddressMempool(addresses);
    }
}
