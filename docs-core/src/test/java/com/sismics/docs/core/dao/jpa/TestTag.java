package com.sismics.docs.core.dao.jpa;

import java.util.List;
import com.sismics.docs.BaseTransactionalTest;
import com.sismics.docs.core.util.jpa.SortCriteria;
import com.sismics.docs.core.dao.TagDao;
import com.sismics.docs.core.model.jpa.Tag;
import com.sismics.docs.core.dao.criteria.TagCriteria;
import com.sismics.docs.core.dao.dto.TagDto;

import com.sismics.docs.core.util.TransactionUtil;
import com.sismics.docs.core.util.authentication.InternalAuthenticationHandler;
import org.junit.Assert;
import org.junit.Test;

public class TestTag extends BaseTransactionalTest {
    @Test
    public void testGetTagById() throws Exception {
        // Create a user

        TagDao tagDao = new TagDao();
        Tag returnTag = tagDao.getById("0");

        assert(returnTag == null);
        
    }

    @Test
    public void testSearchByCra() throws Exception {
        // Create a user

        TagDao tagDao = new TagDao();
        
        List<TagDto> tagList = tagDao.findByCriteria(new TagCriteria(), new SortCriteria(1, true));


        
    }

}