<!DOCTYPE html>
<html>
	<head>
		<title>资产界面</title>
		<link rel="icon" href="/favicon.ico" mce_href="/favicon.ico" type="image/x-icon"/>
		<link rel="stylesheet" href="css/style.css"/>
		<link rel="stylesheet" href="css/user.css"/>
		<link rel="stylesheet" href="css/assets.css"/>
		<link href="css/iconfont/RjdaoIcon.css" rel="stylesheet" type="text/css">
		<script type="text/javascript" src="http://libs.baidu.com/jquery/1.9.0/jquery.js"></script>
		<script src="https://img.hcharts.cn/highcharts/highcharts.js"></script>
		<style>
			article,aside,blockquote,body,button,code,dd,details,div,dl,dt,fieldset,figcaption,figure,footer,form,h1,h2,h3,
			h4,h5,h6,header,hgroup,hr,input,legend,li,menu,nav,ol,p,pre,section,td,textarea,th,
			ul {
				margin: 0;
				padding: 0;
			}

			body,button,input,select,
			textarea {
				font: 12px/1.5 tahoma, arial, \5b8b\4f53;
			}

			h1,h2,h3,h4,h5,
			h6 {
				font-size: 100%;
				font-weight: 700;
				color: rgb(0, 0, 0);
			}

			input,
			select,
			textarea {
				font-size: 100%;
			}

			th {
				text-align: inherit;
			}

			address,caption,cite,code,dfn,em,th,
			var {
				font-style: normal;
				font-weight: 500;
			}

			caption,
			th {
				text-align: left;
			}

			ol,
			ul {
				list-style: none;
			}

			article,aside,blockquote,body,button,code,dd,details,div,dl,dt,fieldset,figcaption,figure,footer,form,h1,h2,
			h3,h4,h5,h6,header,hgroup,hr,input,legend,li,menu,nav,ol,p,pre,section,td,textarea,th,
			ul {
				margin: 0;
				padding: 0;
			}

			body {
				margin: 0;
				padding: 0;
			}

			html body {
				font-family: tahoma, arial, Hiragino Sans GB, Microsoft Yahei, \5B8B体;
				font-size: 14px;
				color: #1a1a1a;
				-webkit-font-smoothing: antialiased;
			}

			html {
				color: #000;
				background: #fff;
				-webkit-text-size-adjust: 100%;
				-ms-text-size-adjust: 100%;
			}

			html {
				font-family: sans-serif;
				-ms-text-size-adjust: 100%;
				-webkit-text-size-adjust: 100%;
				background-color: #fff;
			}

			#container {
				background-color: #f2f2f2;
			}

			a,
			ins {
				text-decoration: none;
			}

			a {
				color: #06b;
			}

			a {
				background: transparent;
			}

			a,
			ins {
				text-decoration: none;
			}

			a {
				color: #0ae;
				cursor: pointer;
			}

			.fn-hide,
			.hidden {
				display: none;
			}

			.switch-btn {
				position: relative;
				width: 30px;
				height: 40px;
				color: #999;
				display: inline-block;
				top: -120px;
			}

			body .fn-hide {
				display: none;
			}

			html body .fn-hide {
				display: none;
			}

			#guide2 {
				position: absolute;
				z-index: 999;
				width: 698px;
				display: none;
			}

			.ui-table {
				border-collapse: collapse;
				border: 1px solid #ccc;
				width: 100%;
				font-size: 12px;
				text-align: left;
			}

			ol,
			ul {
				list-style: none;
			}

			.fn-clear {
				zoom: 1;
			}

			.ui-footer {
				margin-top: 30px;
				border-top: 1px solid #cccccc;
				height: 100px;
				color: #808080;
			}

			.box-bill-content {
				margin: 10px auto 0px;
				text-align: center;
				overflow: hidden;
				width: 990px;
			}

			html body .fn-right {
				float: right;
			}

			.i-asset-tab {
				background: none;
				border: 0px;
				float: left;
			}

			table.ui-table {
				table-layout: fixed;
				border: 1px solid #E6E6E6;
				width: 100%;
				color: #666;
			}

			ul.wealth-list {
				width: 9999px;
				overflow: hidden;
				height: auto;
			}

			.wealth-item {
				padding-top: 12px;
				height: 208px;
				text-align: left;
				float: left;
				width: 710px;
			}

			.box-bill-kyje-account {
				font-size: 48px;
				color: #ff8208;
				font-weight: normal;
				width: 620px;
			}

			.ui-line {
				font-size: 1px;
				line-height: 0;
				overflow: hidden;
				border: 0;
				height: 1px;
				background: #eeeeee;
				display: block;
				margin: 0 0 0 0;
			}

			html body .fn-clear {
				zoom: 1;
			}

			#guide2 .con {
				padding: 44px 0 0 14px;
			}

			#guide2 .top-img {
				position: absolute;
				left: 20px;
				top: -100px;
				width: 466px;
				height: 128px;
				background: url(https://t.alipayobjects.com/images/rmsweb/T1pANhXbFaXXXXXXXX.png) no-repeat;
			}

			#guide2 .bot-img {
				position: absolute;
				left: 160px;
				top: 175px;
				width: 305px;
				height: 82px;
				background: url(https://t.alipayobjects.com/images/rmsweb/T1pANhXbFaXXXXXXXX.png) no-repeat 0 -429px;
			}

			#guide2-next {
				position: absolute;
				left: 212px;
				top: 270px;
				display: block;
				width: 207px;
				height: 66px;
				background: url(https://t.alipayobjects.com/images/rmsweb/T1pANhXbFaXXXXXXXX.png) no-repeat -49px -522px;
				text-indent: -3000em;
			}

			#guide2-close {
				position: absolute;
				top: -20px;
				right: 10px;
				display: block;
				width: 48px;
				height: 48px;
				background: url(https://t.alipayobjects.com/images/rmsweb/T1pANhXbFaXXXXXXXX.png) no-repeat 0 -217px;
				text-indent: -3000em;
			}

			#guide2 .block {
				float: left;
				margin-left: 10px;
				background: #FFF;
				padding: 2px;
				border-radius: 9px;
				width: 296px;
				height: 120px;
			}

			#guide2 .block-c {
				position: relative;
				border: 1px solid #EEE;
				border-radius: 9px;
				height: 98px;
				padding: 10px 10px 10px 90px;
			}

			fieldset,
			img {
				border: 0;
			}

			img {
				border: 0;
			}

			.block .img-icon {
				position: absolute;
				left: 30px;
				top: 20px;
				display: block;
				width: 48px;
				height: 48px;
			}

			h6 {
				font-size: 12px;
			}

			#guide2 h6 {
				font-size: 14px;
				color: #333;
			}

			#guide2 p {
				color: #858585;
				font-size: 12px;
				margin: 8px 0 6px;
			}

			button,
			input,
			optgroup,
			select,
			textarea {
				color: inherit;
				font: inherit;
				margin: 0;
			}

			button {
				overflow: visible;
			}

			button,
			select {
				text-transform: none;
			}

			input {
				line-height: normal;
			}

			.jui-btn {
				display: inline-block;
				height: 32px;
				margin: 0;
				padding: 0 24px;
				border: 1px solid #ddd;
				border-radius: 4px;
				outline: 0;
				background-image: none;
				background-color: #fff;
				font-size: 14px;
				font-weight: 400;
				line-height: 30px;
				color: #1a1a1a;
				text-align: center;
				vertical-align: top;
				white-space: nowrap;
				cursor: pointer;
				user-select: none;
				-webkit-user-select: none;
				-moz-user-select: none;
				-ms-user-select: none;
				box-sizing: border-box;
				-moz-box-sizing: border-box;
				-webkit-box-sizing: border-box;
				-o-box-sizing: border-box;
			}

			button,
			html input[type=button],
			input[type=reset],
			input[type=submit] {
				-webkit-appearance: button;
				cursor: pointer;
			}

			#guide2 button {
				width: 67px;
				height: 23px;
				background: #0ae;
				color: #fff;
				line-height: 23px;
				font-size: 12px;
				border: none;
				border-radius: 1px;
				cursor: pointer;
			}

			.alipay-xbox-1_1_5 .alipay-xbox {
				background-color: rgba(0, 0, 0, 0.5);
				filter: progid:DXImageTransform.Microsoft.Gradient(startColorstr=#88000000, endColorstr=#88000000);
				padding: 6px;
				-webkit-transition: height .3s ease-in-out .3s;
				-moz-transition: height .3s ease-in-out .3s;
				-o-transition: height .3s ease-in-out .3s;
				-ms-transition: height .3s ease-in-out .3s;
				transition: height .3s ease-in-out .3s;
				border: 0;
			}

			.alipay-xbox-1_1_5 .alipay-xbox,
			.alipay-xbox-1_1_5 .alipay-xbox-hide {
				-webkit-transform: scale(0.7);
				-moz-transform: scale(0.7);
				-ms-transform: scale(0.7);
				transform: scale(0.7);
				opacity: 0;
				-webkit-transition: opacity .2s, transform .2s;
				-moz-transition: opacity .2s, transform .2s;
				transition: opacity .2s, transform .2s;
			}

			:root .alipay-xbox-1_1_5 .alipay-xbox {
				filter: none\9;
			}

			.alipay-xbox-1_1_5 .alipay-xbox-close {
				color: #999;
				cursor: pointer;
				display: block;
				font-family: tahoma;
				font-size: 24px;
				font-weight: 700;
				height: 18px;
				line-height: 14px;
				position: absolute;
				right: 16px;
				text-decoration: none;
				top: 16px;
				z-index: 10;
			}

			.alipay-xbox-1_1_5 .alipay-xbox-loading {
				border-radius: 10px;
				position: absolute;
				top: -2px;
				*top: 0:;
				top: 0\0;
				left: 0px;
				background: #CBFE1C;
				box-shadow: 0px 0px 12px #cbfe1c;
				height: 2px;
				zoom: 1;
				overflow: hidden;
			}

			.alipay-xbox-1_1_5 .alipay-xbox-content {
				background: #fff;
				height: 100%;
				*zoom: 1:;
			}

			.jui-notice .jui-notice-header {
				position: relative;
				padding: 26px 30px 20px 86px;
				border-bottom-width: 1px;
				border-bottom-style: solid;
				font-size: 14px;
				line-height: 26px;
				color: gray;
			}

			.jui-notice.jui-notice-cue .jui-notice-header,
			.jui-notice .jui-notice-header {
				background-color: #e5f5ff;
				border-color: #cbd7e3;
			}

			.auto_transfer_box-bill-content {
				margin: 20px;
				text-align: center;
			}

			h2 {
				font-size: 28px;
			}

			.jui-notice .jui-notice-header .tc-sz {
				font-size: 15px;
				font-weight: bold;
				line-height: 30px;
				color: #3c3c3c;
			}

			.content-container {
				min-height: 300px;
			}

			.ui-footer {
				border-top: 1px solid #ccc;
				height: 100px;
				background-color: #f5f5f5;
			}

			.ui-footer-ctn {
				border-top: 1px solid #ffffff;
				padding-top: 15px;
				text-align: center;
			}

			.ui-footer-copyright {
				text-align: center;
				background-color: #f5f5f5;
			}

			.ui-footer-copyright,
			.ui-footer-phone {
				padding-top: 10px;
			}

			.ui-footer-copyright a,
			.ui-footer-copyright a:hover {
				color: #808080;
			}

			.copyright,
			.copyright a,
			.copyright a:hover {
				color: #808080;
			}

			.server {
				color: #fff;
			}

			.ui-footer-copyright .server {
				color: #f5f5f5;
			}

			.ui-footer-link a,
			.ui-footer-link a:hover {
				color: #808080;
			}

			.ui-footer-link a {
				padding: 0 3px 0 2px;
			}

			td,
			th {
				padding: 0;
			}

			address,
			caption,
			cite,
			code,
			dfn,
			em,
			th,
			var {
				font-style: normal;
				font-weight: 500;
			}

			.ui-footer .ui-separator {
				font-weight: normal;
			}

			.box-bill {
				margin: 20px auto 0px;
				border: 1px solid #e6e6e6;
				border-top: 3px solid #ff7700;
				background: #ffffff;
				width: 988px;
				height: 254px;
			}

			.ui-paging-which input {
				height: 20px;
				line-height: 20px;
				padding: 0 6px;
				width: 22px;
				border: 1px solid;
				border-color: #aaa #d1d1d1 #d1d1d1 #aaa;
			}

			.ui-bill-text {
				width: 98px;
				height: 24px;
				border-radius: 0px;
				border: 1px solid #bfbfbf;
				background: #ffffff;
				font-size: 14px;
				color: #a6a6a6;
				text-align: center;
				margin-top: 4px;
			}

			:root input {
				font: 14px Hiragino Sans GB, Microsoft Yahei, \\5B8B\4F53, \9;
			}

			#guideMask {
				_position: absolute;
				position: fixed;
				left: 0px;
				top: 0px;
				width: 100%;
				height: 100%;
				background: #000;
				opacity: 0.7;
				filter: alpha(opacity=70);
				z-index: 998;
				display: none;
			}

			.jui-notice.jui-notice-error .jui-notice-header {
				background-color: #fceee8;
				border-color: #f6c8b5;
			}

			.jui-notice.jui-notice-nobg .jui-notice-header {
				background-color: transparent;
				border: 0;
			}

			.jui-notice .jui-notice-header .jui-notice-title {
				font-size: 18px;
				font-weight: 700;
				line-height: 30px;
				color: #3c3c3c;
			}

			.jui-notice.jui-notice-nobg.jui-notice-error .jui-notice-title {
				color: #f4333c;
			}

			table {
				border-collapse: collapse;
				border-spacing: 0px;
			}

			.fn-left,
			.fn-right {
				display: inline;
			}

			.fn-right {
				float: right;
			}

			.ui-bill-subtitle {
				width: 481px;
				margin-top: 4px;
			}

			.i-asset-tab-item {
				width: 118px;
				height: 47px;
			}

			.i-asset-tab li {
				border: 1px solid #e6e6e6;
				border-bottom: 0px;
				margin-right: 10px;
				background: url(https://i.alipayobjects.com/i/ecmng/png/201501/4GjaEcNWfd.png) repeat-x bottom left #FFF;
				height: 40px;
				line-height: 40px;
				position: relative;
				top: 1px;
				float: left;
			}

			.fn-left {
				float: left;
			}

			.wealth-content {
				width: 698px;
				border: 1px solid #E6E6E6;
				height: 220px;
				overflow: hidden;
			}

			.wealth-banner {
				width: 282px;
				margin-left: 6px;
				height: 222px;
				border: 0px none;
			}

			.box-bill-account {
				background-color: #ffffff;
				height: 182px;
				margin: 38px 40px 30px 40px;
				width: 626px;
				table-layout: fixed;
			}

			.box-bill-info {
				background-color: #fcfbf7;
				width: 253px;
				border-left: 1px solid #eeeeee;
				height: 216px;
				padding: 38px 0 0 28px;
			}

			html body .fn-left {
				float: left;
			}

			html body .fn-left,
			html body .fn-right {
				display: inline-block;
			}

			html body .fn-right {
				float: right;
			}

			table {
				border-collapse: collapse;
				border-spacing: 0px;
			}

			.ui-table thead {
				color: #666;
				background-color: ;
				filter: progid:DXImageTransform.Microsoft.gradient(startColorstr="#F8F8F8", endColorstr="#F2F2F2");
				background: linear-gradient(top, #f8f8f8, #f2f2f2);
			}

			.ui-table tr {
				color: gray;
			}

			.ui-table tr {
				background: #fff;
			}

			.ui-table thead tr {
				color: #666;
			}

			.ui-table tr:nth-child(2n+1) {
				background: #f6f6f6;
			}

			.ui-table-hover,
			.ui-table-split,
			.ui-table tr:nth-child(2n) {
				background-color: #fbfbfb;
			}

			.ui-table tr:nth-child(2n),
			.ui-table-hover,
			.ui-table-split {
				background-color: #fff;
			}

			.billLink {
				text-align: center;
			}

			caption,
			th {
				text-align: left;
			}

			.ui-table th {
				text-align: left;
			}

			.ui-table td,
			.ui-table th {
				border-bottom: 1px solid #d9d9d9;
			}

			.ui-table td {
				padding: 8px 9px 7px;
			}

			.ui-table th {
				padding: 7px 9px;
			}

			.ui-table th,
			.ui-table td {
				padding: 20px 60px 20px 40px;
			}

			.ui-table td {
				border-top: 0 none;
				border-bottom: 0;
				font-size: 14px;
				color: #a6a6a6;
			}

			#page-main {
				text-align: right;
			}

			.ui-paging,
			.ui-paging input {
				color: gray;
				margin: 0;
				padding: 0;
				zoom: 1;
				font-size: 12px;
				vertical-align: middle;
			}

			.ui-paging,
			.ui-paging input {
				color: #808080;
				margin: 0;
				padding: 0;
				zoom: 1;
				font-size: 12px;
				vertical-align: middle;
			}

			.ui-paging {
				float: right;
			}

			.ui-paging-goto,
			.ui-paging-next,
			.ui-paging-prev {
				background-color: #f6f6f6;
				padding: 0 8px;
				border: 1px solid #ccc;
				border-radius: 3px;
			}

			.ui-paging-info {
				line-height: 24px;
				margin-right: 5px;
				height: 24px;
			}

			.ui-paging-prev,
			.ui-paging-next,
			.ui-paging-goto {
				background-color: #f9f9f9;
				background: -webkit-gradient(linear, left top, left bottom, from(#FEFEFE), to(#F4F4F4));
				background: -moz-linear-gradient(top, #FEFEFE, #F4F4F4);
				filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#FEFEFE', endColorstr='#F4F4F4');
				background: -o-linear-gradient(top, #FEFEFE, #F4F4F4);
				background: linear-gradient(top, #FEFEFE, #F4F4F4);
				padding: 0 8px;
				border: 1px solid #ccc;
				border-radius: 3px;
				box-shadow: inset 0px 0px 0px 1px #fff;
			}

			.ui-paging .ui-paging-prev {
				margin: 0 3px 0 0;
			}

			.ui-paging .ui-paging-prev {
				margin: 0 3px 0 0;
			}

			.ui-paging-info {
				line-height: 24px;
				margin-right: 5px;
				height: 24px;
			}

			.ui-paging a,
			.ui-paging span.ui-paging-next,
			.ui-paging span.ui-paging-prev {
				text-decoration: none;
				color: gray;
				margin: 0 3px;
				display: inline-block;
				*display: inline:;
				*zoom: 1:;
				vertical-align: middle;
				height: 22px;
				line-height: 22px;
			}

			.ui-paging .iconfont {
				font-size: 10px;
				color: #787878;
			}

			.ui-paging .iconfont {
				font-size: 10px;
				color: #787878;
			}

			.ui-paging span.ui-paging-next,
			.ui-paging span.ui-paging-next .iconfont,
			.ui-paging span.ui-paging-prev,
			.ui-paging span.ui-paging-prev .iconfont {
				color: #fff;
				box-shadow: none;
				background: #d4d4d4;
				border-color: #d4d4d4;
				filter: none;
			}

			.ui-paging a,
			.ui-paging span.ui-paging-prev,
			.ui-paging span.ui-paging-next {
				text-decoration: none;
				color: #808080;
				margin: 0 3px;
				display: inline-block;
				*display: inline:;
				*zoom: 1:;
				vertical-align: middle;
				height: 22px;
				line-height: 22px;
			}

			.ui-paging span.ui-paging-prev,
			.ui-paging span.ui-paging-next,
			.ui-paging span.ui-paging-prev .iconfont,
			.ui-paging span.ui-paging-next .iconfont {
				color: #fff;
				box-shadow: none;
				background: #d4d4d4;
				border-color: #d4d4d4;
				filter: none;
			}

			.ui-paging a.ui-paging-item {
				background-color: #f3f3f3;
				font-weight: 700;
				padding: 0 8px;
				border: none;
			}

			.ui-paging a.ui-paging-current,
			.ui-paging a.ui-paging-item:hover {
				color: #fff;
				background: #ff9c00;
			}

			.ui-paging a.ui-paging-current,
			.ui-paging a.ui-paging-item:hover {
				color: #fff;
				background: #0ae;
			}

			.ui-paging a.ui-paging-item {
				background-color: #f3f3f3;
				font-weight: bold;
				padding: 0 8px;
				border: none;
			}

			.ui-paging a.ui-paging-current,
			.ui-paging a.ui-paging-item:hover {
				color: #fff;
				background: #0ae;
			}

			.ui-paging-which input {
				height: 20px;
				line-height: 20px;
				padding: 0 6px;
				width: 22px;
				border: 1px solid;
				border-color: #aaa #d1d1d1 #d1d1d1 #aaa;
			}

			.ui-paging-bold {
				font-weight: 700;
				padding: 0 8px;
			}

			.ui-paging-bold {
				font-weight: bold;
				padding: 0 8px;
			}

			.iconfont {
				font-family: "rei";
				font-style: normal;
				font-weight: normal;
				cursor: default;
				-webkit-font-smoothing: antialiased;
			}

			.iconfont {
				font-family: rei;
				font-style: normal;
				cursor: default;
				-webkit-font-smoothing: antialiased;
			}

			.iconfont {
				font-family: jui, rei;
				font-weight: 400;
				font-style: normal;
				cursor: default;
				-webkit-font-smoothing: antialiased;
				-webkit-text-stroke-width: 0.2px;
			}

			.iconfont {
				font-size: 16px;
				font-style: normal;
				-webkit-font-smoothing: antialiased;
				-webkit-text-stroke-width: 0.2px;
				-moz-osx-font-smoothing: grayscale;
			}

			.ui-table td.billAmount {
				color: #ff8208;
				text-align: right;
				padding: 20px 100px 20px 40px;
			}

			.ui-table td.billInfo {
				color: #1a1a1a;
			}

			.ui-table th {
				background: #FFF;
				border-bottom: 0;
				line-height: 14px;
				font-size: 14px;
				color: #a6a6a6;
				border-bottom: 1px solid #e8e8e8;
			}

			.ui-table th.billAmount {
				text-align: right;
				padding: 20px 100px 20px 40px;
			}

			html body .fn-left {
				float: left;
			}

			.i-asset-tab li.i-asset-tab-item-current {
				background: #FFF;
				height: 40px;
				line-height: 40px;
			}

			.i-asset-tab-item a {
				height: 42px;
				font-weight: normal;
				line-height: 42px;
				margin-left: 0px;
				font-size: 18px;
				color: #1a1a1a;
				text-align: center;
				width: 120px;
				display: inline-block;
			}

			.jui-btn.jui-btn-sm {
				height: 24px;
				padding: 0 20px;
				font-size: 12px;
				line-height: 22px;
				border-radius: 2px;
			}

			.jui-btn.jui-btn-sm {
				height: 30px;
			}

			#J_downLoad_30 {
				background: url(https://t.alipayobjects.com/images/rmsweb/T17UphXjRhXXXXXXXX.png) no-repeat 0 0;
				width: 78px;
				height: 32px;
				border: none;
			}

			#J_downLoad {
				background: url(https://t.alipayobjects.com/images/rmsweb/T1MmFhXo8fXXXXXXXX.png) no-repeat 0 0;
				width: 78px;
				height: 32px;
				border: none;
			}

			#J_submit_time {
				background: url('https://t.alipayobjects.com/images/rmsweb/T1dl4hXgxkXXXXXXXX.png');
				width: 78px;
				height: 32px;
				border-radius: 0px;
				border: 0px none;
				margin-left: 8px;
			}

			.fn-bgwhite {
				background-color: #fff;
			}

			.wealth-banner {
				width: 278px;
				margin-left: 10px;
				height: 220px;
				border: 1px solid #d9d9d9;
			}

			.switch-btn.pre {
				left: -317px;
				background: url(https://t.alipayobjects.com/images/rmsweb/T1_7RhXb8aXXXXXXXX.png) no-repeat 0 0;
			}

			.switch-btn.next {
				left: 317px;
				background: url(https://t.alipayobjects.com/images/rmsweb/T1XQxhXiJbXXXXXXXX.png) no-repeat 0 0;
			}

			.switch-btn.pre-hide {
				left: 334px;
			}

			h5 {
				font-size: 14px;
			}

			.wealth-item h5 {
				padding-right: 10px;
				margin-bottom: 25px;
				width: 100px;
				height: 30px;
				line-height: 30px;
				color: #fff;
				background: url(https://t.alipayobjects.com/images/rmsweb/T1v_phXfllXXXXXXXX.png) no-repeat 0px 0px;
				font-size: 18px;
				text-align: left;
				font-weight: 400;
				padding-left: 20px;
			}

			.wealth-item-small h5 {
				padding-right: 10px;
				margin-bottom: 15px;
				width: 100px;
				height: 30px;
				line-height: 30px;
				color: #fff;
				background: url(https://t.alipayobjects.com/images/rmsweb/T1v_phXfllXXXXXXXX.png) no-repeat 0px 0px;
				font-size: 18px;
				text-align: left;
				font-weight: 400;
				padding-left: 20px;
			}

			.wealth-item .block {
				position: relative;
				float: left;
				padding-left: 110px;
				width: 210px;
			}

			.wealth-item-small .block {
				position: relative;
				float: left;
				padding-left: 105px;
				width: 225px;
				margin-bottom: 20px;
			}

			.wealth-item .img-icon {
				position: absolute;
				left: 40px;
				top: 0px;
				display: block;
				width: 48px;
				height: 48px;
			}

			.wealth-item-small .img-icon {
				position: absolute;
				left: 55px;
				top: 5px;
				display: block;
				width: 38px;
				height: 38px;
			}

			.wealth-item h6 {
				font-size: 14px;
				color: #333;
				font-weight: normal;
			}

			.wealth-item p {
				color: #858585;
				font-size: 12px;
				margin: 0px 0 10px;
			}

			.wealth-item-small p {
				color: #858585;
				font-size: 12px;
				margin: 5px 0 0px;
			}

			html body .fn-inline {
				display: -moz-inline-stack;
				display: inline-block;
				*display: inline:;
				zoom: 1;
			}

			html body .fn-inline {
				display: -moz-inline-stack;
				display: inline-block;
				*display: inline:;
				zoom: 1;
			}

			.wealth-item h6 a {
				font-weight: normal;
				font-size: 12px;
				margin-left: 10px;
			}

			.wealth-item a.jui-btn {
				width: 67px;
				height: 23px;
				background: #0ae;
				color: #fff;
				line-height: 23px;
				font-size: 12px;
				border: none;
				border-radius: 1px;
			}

			#J_dialog_autoDepositUnSign {
				font-size: 12px;
				margin-left: 10px;
			}

			.box-bill-info li {
				float: left;
				width: 120px;
			}

			li.box-bill-item {
				height: 100px;
			}

			.box-bill-info-title {
				line-height: 12px;
				font-size: 12px;
				color: #a9a9a9;
			}

			.box-bill-info-account {
				font-size: 24px;
				color: #666666;
			}

			.ft-unit {
				color: #999999;
				font-weight: normal;
				font-size: 14px;
			}

			.box-bill-foot {
				margin: 18px 0 0 0;
				display: inline-block;
				height: 77px;
			}

			.td-line {
				border-left: 1px solid #eeeeee;
				padding-left: 39px;
				padding-top: 10px;
			}

			.box-bill-account td {
				width: 280px;
			}

			.box-bill-title {
				line-height: 12px;
				font-size: 12px;
				color: #a9a9a9;
			}

			.totalFreezeShare-title {
				position: relative;
				top: -3px;
			}

			.box-bill-foot-account {
				font-size: 30px;
				color: #666666;
			}

			.cc-zhxjoinlink {
				position: relative;
				top: 4px;
			}

			.eye {
				background: url(https://t.alipayobjects.com/images/rmsweb/T1bUFhXk0aXXXXXXXX.png) no-repeat 0 0 #fff;
				display: inline-block;
				height: 12px;
				width: 16px;
			}

			.box-bill-title * {
				display: inline-block;
			}

			.box-bill-zhuanchuLink {
				font-size: 14px;
				font-weight: normal;
				position: relative;
				top: -14px;
			}

			html body .fn-ml10 {
				margin-left: 10px;
			}

			html body .fn-ml10 {
				margin-left: 10px;
			}

			.ui-line {
				font-size: 0px;
				line-height: 0;
				overflow: hidden;
				border: 0;
				height: 1px;
				background-color: #ccc;
				display: block;
				margin: 5px 0;
			}

			.box-bill-account .ui-line {
				width: 626px;
			}

			.box-bill-kyje-account * {
				display: inline-block;
			}

			.box-bill-zhuanruLink {
				position: relative;
				top: 20px;
			}

			html body .fn-ml20 {
				margin-left: 20px;
			}

			html body .fn-ml20 {
				margin-left: 20px;
			}

			.jui-btn.jui-btn-blue {
				background-color: #0ae;
				border-color: #0ae;
				color: #fff;
			}

			#J-nav-merchant {
				position: relative;
				top: 0px;
				left: 0px;
				z-index: 990;
				width: 100%;
				height: 109px;
				min-width: 1200px;
				font: 12px/1.5 tahoma, arial, "Hiragino Sans GB", "Microsoft Yahei", "\5b8b\4f53";
				-webkit-font-smoothing: antialiased;
			}

			.common-top-nav {
				height: 28px;
				line-height: 28px;
				background: #242735;
				font-size: 12px;
				color: #aaabaf;
			}

			#J-nav-merchant .nav-merchant-top-wrapper,
			#J-nav-merchant .nav-merchant-header-wrapper {
				width: 100%;
			}

			#J-nav-merchant .nav-merchant-header-wrapper {
				height: 80px;
				line-height: 80px;
				background: #fdfdfd;
				border-bottom: 1px #eee solid;
			}

			#J-nav-merchant .nav-merchant-top,
			#J-nav-merchant .nav-merchant-header {
				zoom: 1;
				width: 990px;
				height: 100%;
				margin: 0 auto;
			}

			#J-nav-merchant .nav-merchant-header {
				position: relative;
				top: 0px;
				left: 0px;
			}

			h1 {
				font-size: 2em;
				margin: .67em 0;
			}

			h1 {
				font-size: 32px;
			}

			#J-nav-merchant .nav-merchant-header .nav-left-part,
			#J-nav-merchant .nav-merchant-header .nav-right-part {
				zoom: 1;
				height: 80px;
				width: 840px;
				line-height: 80px;
			}

			.nav-left-part .logo {
				overflow: hidden;
				position: absolute;
				top: 16px;
				left: -2px;
			}

			.common-top-nav-link {
				color: #999;
				text-decoration: none;
				font-size: 12px;
			}

			.nav-common a,
			.nav-common a:active {
				color: #fff;
				text-decoration: none;
			}

			.iconfont-crmhome {
				font-family: "crmhome";
				font-weight: 400;
				font-style: normal;
				cursor: default;
				-webkit-font-smoothing: antialiased;
				-webkit-text-stroke-width: 0.2px;
			}

			.iconfont-crmhome {
				font-family: crmhome;
				font-weight: 400;
				font-style: normal;
				cursor: default;
				-webkit-font-smoothing: antialiased;
				-webkit-text-stroke-width: 0.2px;
			}

			.nav-left-part .logo * {
				float: left;
			}

			.nav-left-part .logo .bar {
				margin: 9px 15px 0;
				width: 1px;
				height: 34px;
				border-left: 1px solid #808080;
			}

			.nav-left-part .logo .navTitle {
				color: #1a1a1a;
			}

			.nav-left-part .logo .brand {
				font-size: 20px;
				font-weight: normal;
				line-height: 30px;
				margin-top: 10px;
			}

			.nav-left-part .logo .aliLogo {
				font-size: 42px;
				line-height: 48px;
				color: #0ae;
			}

			.nav-left-part .logo .aliLogoTxt {
				font-size: 70px;
				line-height: 48px;
				color: #3f3a39;
			}

			.common-top-nav-main {
				width: 990px;
				margin: 0 auto;
			}

			.common-top-nav-right {
				float: right;
			}

			.common-top-nav-left {
				float: left;
			}

			.common-top-nav ul {
				padding: 0;
				margin: 0;
			}

			.common-top-nav-item-login {
				padding-right: 15px;
			}

			.common-top-nav-item-fisrt {
				border-left: 1px #dfdfdf solid;
			}

			.common-top-nav-item-border,
			.common-top-nav-item-fisrt {
				background: #242735;
				height: 26px;
				border-right: 1px #aaabaf solid;
			}

			.common-top-nav li {
				list-style: none;
			}

			.common-top-nav-right .common-top-nav-item {
				float: left;
			}

			.common-top-nav-item-border .common-top-nav-link,
			.common-top-nav-item-fisrt .common-top-nav-link {
				height: 26px;
				padding: 0 10px;
				display: inline-block;
			}

			.common-top-nav-icon-gray,
			.common-top-nav-icon-mini {
				width: 12px;
				vertical-align: middle;
				margin-top: -3px;
				border: none;
			}

			.common-top-nav-link .common-top-nav-icon-mini {
				display: none;
			}

			.common-top-nav-item-i .common-top-nav-link {
				padding: 0 20px 0 15px;
				display: inline-block;
				height: 12px;
				line-height: 12px;
				border-left: 1px #999 solid;
				margin-top: -2px\9;
			}
		</style>
	</head>
	<body>
	<!----最最上面的，像标头---->
	<div class="topnav">
		<div class="mainw w">
			<div class="l-txt">欢迎致电：400-8800-379 &nbsp;&nbsp; 服务时间：08:30-18:30（工作日）</div>
			<#--<div class="wapbut">-->
			<#--<span>手机端</span><i class="icon-0198"></i>-->
			<#--<div class="qrc"><img src="images/qrc.png"></div>-->
			<#--</div>-->
			<a href="kefu.html" class="dh">在线客服</a>
			<a href="help.html" class="dh">帮助中心</a>
		</div>
	</div>
	<header>
		<div class="hmain w">
			<a href="index.html" class="logo"><img src="/images/logo.png"></a>
			<a href="login.html" class="ubut">退出</a>
			<a href="/toassets" class="ubut" style="padding:0 15px;">个人中心<span><dl>我的资产：2830.00</dl></span></a>
			<nav>
				<a href="index.html">首页</a>
				<a href="about.ftl">基金</a>
				<a href="touzi_list.html">理财</a>
				<a href="service.html">保险</a>
			</nav>
		</div>
	</header>
	<!----header---->



	<!---第一块，这里显示头像，账号什么的---->
	<div class="user-top">

		<div class="userinfo">

			<a href="" class="portrait" style="margin-top:10px;"><em>编辑头像</em><img src="images/user-portrait.jpg"></a>
			<div class="minfo" style="margin-top:30px;">
				<div class="it"><dl>ID：</dl><span class="mr1">633748</span> <dl>用户名：</dl><span>xiezhengyi</span></div>
				<div class="it">
					<dl>绑定手机号：</dl><span>187****6613</span>
					<a class="ml1" title="手机"><i class="icon-0566"></i></a>
					<a class="ml1" title="QQ"><i class="icon-0069"></i></a>
					<a class="ml1" title="微信"><i class="icon-0061"></i></a>
					<a class="ml1" title="淘宝"><i class="icon-0064"></i></a>
					<a href="user_account.html" class="ml1" title="设置"><i class="icon-0421"></i></a>
				</div>
			</div>
		</div>

		<div class="nav">
			<a href="user_index.html" class="l"><i class="icon-0101"></i><span>我的项目</span></a>
			<a href="user_account.html" class="l"><i class="icon-0423"></i><span>账户设置</span></a>
			<a href="login.html" class="r"><i class="icon-0735"></i><span>退出</span></a>
		</div>

	</div>
	<!---user---->

	<!--资产金额什么的在这儿-->
	<div class="content-container">
			<div class="box-bill">
				<table class="box-bill-account fn-left">
					<tbody>
						<tr>
							<td colspan="2">
								<span class="box-bill-title bill-title-kyje">
									总资产(元)<a class="cc-zhxjoinlink fn-ml10" href="xxxxx全部的钱,包括基金,理财,剩余的余额" target="_blank" smartracker="on" seed="boxBillTitle-ccZhxjoinlink">
										<img width="16" height="17" src="https://t.alipayobjects.com/images/rmsweb/T1WThhXaFmXXXXXXXX.png">
									</a>
								</span>
								<div class="box-bill-kyje-account fn-clear">
									<span class="box-bill-foot-account eye-val" >
										9878.60
									</span>
									<a title="转入" class="jui-btn jui-btn-blue box-bill-zhuanruLink fn-ml20" href="xxxxx转入" target="_blank"
									 smartracker="on" seed="boxBillKyjeAccount-juiBtn">
										转&nbsp;入
									</a>
									<a title="转出" class="fn-ml10 box-bill-zhuanchuLink  fn-ml10" href="xxxxx转出" target="_blank" smartracker="on"
									 seed="boxBillKyjeAccount-boxBillZhuanchuLink">
										转&nbsp;出
									</a>
								</div>

								<div class="ui-line fn-clear"></div>
							</td>
						</tr>
						<tr>
							<td class="box-bill-foot">
								<span class="box-bill-title bill-title-zje">
									可用余额(元)<a class="cc-zhxjoinlink fn-ml10" href="xxxxx可以提现的钱" target="_blank" smartracker="on" seed="boxBillTitle-ccZhxjoinlink">
										<img width="16" height="17" src="https://t.alipayobjects.com/images/rmsweb/T1WThhXaFmXXXXXXXX.png">
									</a>
								</span>
								<div class="box-bill-foot-account eye-val" >
									2933.60
								</div>
							</td>
							<td class="box-bill-foot td-line">
								<span class="box-bill-title  totalFreezeShare-title">
									体验金(元)<a class="cc-zhxjoinlink fn-ml10" href="xxxxx就是商家赠送的" target="_blank" smartracker="on" seed="boxBillTitle-ccZhxjoinlink">
										<img width="16" height="17" src="https://t.alipayobjects.com/images/rmsweb/T1WThhXaFmXXXXXXXX.png">
									</a>
								</span>
								<div class="box-bill-foot-account eye-val" >
									1000.00
								</div>
							</td>
						</tr>
					</tbody>
				</table>


				<ul class="box-bill-info   fn-left">
					<li class="box-bill-item">
						<span class="box-bill-info-title">昨日收益(元)</span>

						<div class="box-bill-info-account eye-val" data-account="0.02"> 0.02 </div>
					</li>

					<li class="box-bill-item">
						<span class="box-bill-info-title">累计收益(元)</span>
						<div class="box-bill-info-account  eye-val" data-account="143.41">
							143.41
						</div>
					</li>

					<li>
						<span class="box-bill-info-title">
							基金(元)
						</span>
						<div class="box-bill-info-account">
							434.23
						</div>
					</li>

					<li>
						<span class="box-bill-info-title">
							理财(元)
						</span>
						<div class="box-bill-info-account">
							6228.98
						</div>

					</li>
				</ul>
				<div class="fn-clear"></div>
			</div>
		</div>
	<!---user---->

	<#--这里写的是查看流水，应该有分页-->
	<div class="fn-clear box-bill-content">
			<div class="ui-bill-subtitle fn-right  fn-clear">
				<form class="ui-bill-form-time fn-left" id="J-calendar-form" action="xxxxx这是选日期的" method="post" autocomplete="off">
					<input name="startDate" class="ui-bill-text" id="J_dateBegin" type="text" readonly="readonly" value="2019-07-29"
					 smartracker="on" seed="JCalendarForm-J_dateBegin">
					<span> - </span>
					<input name="endDate" class="ui-bill-text" id="J_dateEnd" type="text" readonly="readonly" value="2019-08-28"
					 smartracker="on" seed="JCalendarForm-J_dateEnd">
					<input class="jui-btn jui-btn-sm" id="J_submit_time" type="submit" value="" smartracker="on" seed="JCalendarForm-J_submit_time">
				</form>

			</div>

			<div class="i-asset-tab fn-clear">
				<ul class="i-asset-tab-items fn-clear" id="triggers">
					<li class="i-asset-tab-item fn-left  i-asset-tab-item-current  "><a class="ui-tab-trigger-text ui-bill-tab-text"
						 href="javascript:void(0);" smartracker="on" seed="iAssetTabItem-link">全部</a></li>
					<li class="i-asset-tab-item fn-left  "><a class="ui-tab-trigger-text ui-bill-tab-text" href="xxxxx转出的所有记录在这里"
						 smartracker="on" seed="iAssetTabItem-linkT1">支出</a></li>
					<li class="i-asset-tab-item fn-left  "><a class="ui-tab-trigger-text ui-bill-tab-text" href="xxxxx收益的所有记录在这里"
						 smartracker="on" seed="iAssetTabItem-linkT2">收入</a></li>
				</ul>
			</div>
			<table class="ui-table fn-clear">
				<thead>
					<tr>
						<th class="billTime">日期</th>
						<th class="billAmount">金额(元)</th>
						<th>信息</th>
						<th></th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td class="billTime">2019-08-04 21:44</td>
						<td class="billAmount">1.49</td>
						<td class="billInfo"><span class="emoji-li" style="visibility: visible;">单次转入</span></td>
						<td class="billLink">
							<a href="https://yebprod.alipay.com:443/yeb/purchaseDetail.htm?tradeNo=20190804009130100010380043444354" target="_blank"
							 smartracker="on" seed="billLink-linkT7">&nbsp;查看</a>
						</td>
					</tr>
					<tr>
						<td id="page-main" colspan="4">
							<div data-widget-cid="widget-11">
								<div class="ui-paging"><span class="ui-paging-prev ui-paging-disabled" data-page="0"><i title="左三角形" class="iconfont"></i>
										上一页</span><a class="ui-paging-item ui-paging-current ui-paging-disabled" href="#triggers" data-page="1">1</a><span
									 class="ui-paging-next ui-paging-disabled" data-page="2">下一页 <i title="右三角形" class="iconfont"></i></span><span
									 class="ui-paging-info"><span class="ui-paging-bold">1/1</span>页</span><span class="ui-paging-which"><input
										 type="text" value=""></span><a class="ui-paging-info ui-paging-goto" href="#triggers" data-page="">跳转</a></div>
							</div>
						</td>
					</tr>
				</tbody>
			</table>
		</div>
	<!---user---->

	<#--最下边的，显示一些比如说公司信息，什么公安局备案号什么的-->
		<div class="ui-footer fn-clear" coor="footer">
			<div class="ui-footer-ctn">
				<!-- 最底部的 -->
				<div class="ui-footer-link">

					<a href="xxxxxx招商广告" target="_blank" seed="foot-1">募股频道</a>


					<em class="ui-separator">|</em>
					<a title="联系我们" href="xxxxxx联系我们" target="_blank" seed="foot-2">联系我们</a>

					<em class="ui-separator">|</em>
					<a title="International Business" href="xxxxxx我们的网站" target="_blank" seed="foot-3">我们的网站</a>


				</div>
				<div class="ui-footer-copyright">
					<style>
						.copyright,.copyright a,.copyright a:hover{color:#808080;}
					</style>
					<div class="copyright">
						<a href="xxxxxx京ICP备：00000000号" target="_blank" smartracker="on" seed="copyright-link">© 2018  北京汇创点投科技有限公司  京ICP备：00000000号</a>
					</div>
				</div>
			</div>
		</div>

	</body>
</html>
