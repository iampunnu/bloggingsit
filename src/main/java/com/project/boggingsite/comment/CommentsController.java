package com.project.boggingsite.comment;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/blogs/{blogId}/cooments")
public class CommentsController {
}
