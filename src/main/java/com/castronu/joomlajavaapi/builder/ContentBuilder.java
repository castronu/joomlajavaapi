package com.castronu.joomlajavaapi.builder;

import com.castronu.joomlajavaapi.domain.Content;

import java.sql.Timestamp;
import java.util.Date;

import org.joda.time.DateTime;

/**
 * Created with IntelliJ IDEA.
 * User: diegocastronuovo
 * Date: 13/04/13
 * Time: 13:48
 * To change this template use File | Settings | File Templates.
 */


    public class ContentBuilder
    {
        private Content content;

        private ContentBuilder()
        {
            content = new Content();
        }

        public ContentBuilder withId(int id)
        {
            content.setId(id);
            return this;
        }

        public ContentBuilder withAssetId(int assetId)
        {
            content.setAssetId(assetId);
            return this;
        }

        public ContentBuilder withTitle(String title)
        {
            content.setTitle(title);
            return this;
        }

        public ContentBuilder withAlias(String alias)
        {
            content.setAlias(alias);
            return this;
        }

        public ContentBuilder withIntrotext(String introtext)
        {
            content.setIntrotext(introtext);
            return this;
        }

        public ContentBuilder withFulltext(String fulltext)
        {
            content.setFulltext(fulltext);
            return this;
        }

        public ContentBuilder withState(byte state)
        {
            content.setState(state);
            return this;
        }

        public ContentBuilder withCatid(int catid)
        {
            content.setCatid(catid);
            return this;
        }

        public ContentBuilder withCreated(Timestamp created)
        {
            content.setCreated(created);
            return this;
        }

        public ContentBuilder withCreatedBy(int createdBy)
        {
            content.setCreatedBy(createdBy);
            return this;
        }

        public ContentBuilder withCreatedByAlias(String createdByAlias)
        {
            content.setCreatedByAlias(createdByAlias);
            return this;
        }

        public ContentBuilder withModified(Timestamp modified)
        {
            content.setModified(modified);
            return this;
        }

        public ContentBuilder withModifiedBy(int modifiedBy)
        {
            content.setModifiedBy(modifiedBy);
            return this;
        }

        public ContentBuilder withCheckedOut(int checkedOut)
        {
            content.setCheckedOut(checkedOut);
            return this;
        }

        public ContentBuilder withCheckedOutTime(Timestamp checkedOutTime)
        {
            content.setCheckedOutTime(checkedOutTime);
            return this;
        }

        public ContentBuilder withPublishUp(Timestamp publishUp)
        {
            content.setPublishUp(publishUp);
            return this;
        }

        public ContentBuilder withPublishDown(Timestamp publishDown)
        {
            content.setPublishDown(publishDown);
            return this;
        }

        public ContentBuilder withImages(String images)
        {
            content.setImages(images);
            return this;
        }

        public ContentBuilder withUrls(String urls)
        {
            content.setUrls(urls);
            return this;
        }

        public ContentBuilder withAttribs(String attribs)
        {
            content.setAttribs(attribs);
            return this;
        }

        public ContentBuilder withVersion(int version)
        {
            content.setVersion(version);
            return this;
        }

        public ContentBuilder withOrdering(int ordering)
        {
            content.setOrdering(ordering);
            return this;
        }

        public ContentBuilder withMetakey(String metakey)
        {
            content.setMetakey(metakey);
            return this;
        }

        public ContentBuilder withMetadesc(String metadesc)
        {
            content.setMetadesc(metadesc);
            return this;
        }

        public ContentBuilder withAccess(int access)
        {
            content.setAccess(access);
            return this;
        }

        public ContentBuilder withHits(int hits)
        {
            content.setHits(hits);
            return this;
        }

        public ContentBuilder withMetadata(String metadata)
        {
            content.setMetadata(metadata);
            return this;
        }

        public ContentBuilder withFeatured(byte featured)
        {
            content.setFeatured(featured);
            return this;
        }

        public ContentBuilder withLanguage(String language)
        {
            content.setLanguage(language);
            return this;
        }

        public ContentBuilder withXreference(String xreference)
        {
            content.setXreference(xreference);
            return this;
        }

        public static ContentBuilder content()
        {
            return new ContentBuilder();
        }

        public Content build()
        {

            return content;
        }


    public static Content aContent(String title, String alias, String fullText, String link, String path,int categoryId,String description,String keywords) {

        ContentBuilder contentBuilder=new ContentBuilder();
        byte state=1;
        byte featured=0;
        return contentBuilder.withAssetId(69).withCatid(categoryId).
                withCreated(new Timestamp(new Date().getTime())).withCreatedBy(111).
                withModified(new Timestamp(new Date().getTime())).withCreatedByAlias("").
                withModifiedBy(0).withCheckedOut(0).
                withPublishUp(new Timestamp(new DateTime().minusMonths(3).toDate().getTime())).
                withPublishDown(new Timestamp(new DateTime().plusYears(99).toDate().getTime())).
                withImages("{\"image_intro\":\"\",\"float_intro\":\"\",\"image_intro_alt\":\"\",\"image_intro_caption\":\"\",\"image_fulltext\":\"\",\"float_fulltext\":\"\",\"image_fulltext_alt\":\"\",\"image_fulltext_caption\":\"\"}").
                withUrls("{\"urla\":null,\"urlatext\":\"\",\"targeta\":\"\",\"urlb\":null,\"urlbtext\":\"\",\"targetb\":\"\",\"urlc\":null,\"urlctext\":\"\",\"targetc\":\"\"}").
                withAttribs("{\"show_title\":\"\",\"link_titles\":\"\",\"show_intro\":\"\",\"info_block_position\":\"0\",\"show_category\":\"\",\"link_category\":\"\",\"show_parent_category\":\"\",\"link_parent_category\":\"\",\"show_author\":\"\",\"link_author\":\"\",\"show_create_date\":\"\",\"show_modify_date\":\"\",\"show_publish_date\":\"\",\"show_item_navigation\":\"\",\"show_icons\":\"\",\"show_print_icon\":\"\",\"show_email_icon\":\"\",\"show_vote\":\"\",\"show_hits\":\"\",\"show_noauth\":\"\",\"urls_position\":\"\",\"alternative_readmore\":\"\",\"article_layout\":\"\",\"show_publishing_options\":\"\",\"show_article_options\":\"\",\"show_urls_images_backend\":\"\",\"show_urls_images_frontend\":\"\"}").
                withVersion(1).withOrdering(0).withMetakey(keywords).withMetadesc(description).withAccess(1).withHits(2).
                withState(state).

                withMetadata("{\"robots\":index, follow\"\",\"author\":periodicos diarios\"\",\"rights\":\"\",\"xreference\":\"\"}").withFeatured(featured).withLanguage("*").withXreference("").
                withTitle(title).withAlias(alias).withIntrotext("<p><iframe id=\"blockrandom\" class=\"wrapper\" name=\"iframe\" src=\"http://"+link+"\" frameborder=\"0\" scrolling=\"no\" align=\"top\" width=\"100%\" height=\"3000\"> Questa opzione non funziona correttamente. Sfortunatamente, il tuo browser non supporta gli Inline Frame</iframe></p>"+fullText).
                withFulltext(fullText).build();
    }
}
