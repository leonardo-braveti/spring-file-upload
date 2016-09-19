package br.com.conecteme.upload.controller

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 *
 * @author ### Conecteme - Leonardo Pereira ###
 */
@RequestMapping("/")
class UploadController {
    
    @GetMapping
    public String index(){
        return "index"
    }
    
    public String handleFileUpload(@RequestParam("file1") MultipartFile file1, @RequestParam("file2") MultipartFile file2) 
    {       
        if(file1 == null)
            print "existe1"
        if(file2 == null)
            print "existe2"
    }	

}

