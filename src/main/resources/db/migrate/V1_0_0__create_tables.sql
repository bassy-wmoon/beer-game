CREATE TABLE if not exists `breweries` (
  `brewery_id` int(10) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `name` varchar(50) NOT NULL COMMENT 'ブルワリー名',
  PRIMARY KEY (`brewery_id`),
  UNIQUE KEY `uk_breweries_name` (`name`)
) COMMENT 'ブルワリー';

CREATE TABLE if not exists `beer_styles` (
  `style_id` int(10) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `name` varchar(50) NOT NULL COMMENT 'スタイル名',
  PRIMARY KEY (`style_id`),
  UNIQUE KEY `uk_beer_styles_name` (`name`)
) COMMENT 'ビアスタイル';

CREATE TABLE if not exists `beers` (
  `beer_id` int(10) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `name` varchar(50) NOT NULL COMMENT 'ビール名',
  `style` int(10) NOT NULL COMMENT 'ビアスタイル',
  `description` text(1000) COMMENT '説明',
  PRIMARY KEY (`beer_id`),
  UNIQUE KEY `uk_beers_name` (`name`),
  FOREIGN KEY `fk_beer_style` (`style`) REFERENCES `beer_styles` (`style_id`)
) COMMENT 'ビール';

CREATE TABLE if not exists `beer_photos` (
  `photo_id` int(10) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `url` varchar(50) NOT NULL COMMENT '写真のurl',
  `width` int(10) NOT NULL COMMENT '写真の横幅px',
  `height` int(10) NOT NULL COMMENT '写真の縦幅px',
  PRIMARY KEY (`photo_id`),
  UNIQUE KEY `uk_photo_url` (`url`),
  FOREIGN KEY `fk_photo_id` (`photo_id`) REFERENCES `beers` (`beer_id`)
) COMMENT 'ビールの写真';
