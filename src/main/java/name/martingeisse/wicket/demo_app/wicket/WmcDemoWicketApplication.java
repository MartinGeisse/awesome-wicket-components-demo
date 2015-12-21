/**
 * Copyright (c) 2015 Martin Geisse
 *
 * This file is distributed under the terms of the MIT license.
 */

package name.martingeisse.wicket.demo_app.wicket;

import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.request.IExceptionMapper;
import org.apache.wicket.request.resource.PackageResourceReference;
import org.apache.wicket.util.IProvider;
import name.martingeisse.wicket.demo_app.page.AbstractApplicationPage;
import name.martingeisse.wicket.demo_app.page.NavigationPage;

/**
 * The Wicket {@link WebApplication} implementation.
 */
public class WmcDemoWicketApplication extends WebApplication {

	/**
	 * the RENDER_PROFILING
	 */
	public static final boolean RENDER_PROFILING = false;
	
	/* (non-Javadoc)
	 * @see org.apache.wicket.protocol.http.WebApplication#init()
	 */
	@Override
	protected void init() {
		super.init();

		// settings
		getMarkupSettings().setStripWicketTags(true);
		getMarkupSettings().setDefaultMarkupEncoding("utf-8");

		// register merged resources ("resource bundles")
		/*
		CssResourceReference[] mergedStylesheets = {
			new CssResourceReference(AbstractFrontendPage.class, "common.css"),
		};
		JavaScriptResourceReference[] mergedJavascripts = {
			JQueryResourceReference.get(),
			(JavaScriptResourceReference)getJavaScriptLibrarySettings().getWicketEventReference(),
			(JavaScriptResourceReference)(getDebugSettings().isAjaxDebugModeEnabled() ? getJavaScriptLibrarySettings().getWicketAjaxDebugReference() : getJavaScriptLibrarySettings().getWicketAjaxReference()),
			new JavaScriptResourceReference(AbstractFrontendPage.class, "fastclick.js"),
			new JavaScriptResourceReference(AbstractFrontendPage.class, "jquery.tools.min.js"),
			new JavaScriptResourceReference(AbstractFrontendPage.class, "jquery.scrollTo.min.js"),
			new JavaScriptResourceReference(AbstractFrontendPage.class, "common.js"),
		};
		getResourceBundles().addCssBundle(AbstractFrontendPage.class, "merged.css", mergedStylesheets);
		getResourceBundles().addJavaScriptBundle(AbstractFrontendPage.class, "merged.js", mergedJavascripts);
		

		// create CSS sprite atlases
		getSpriteRegistry().register(true,
			new PackageResourceReference(PaymentIcons.class, "invoice.png"),
			new PackageResourceReference(PaymentIcons.class, "mastercard.png"),
			new PackageResourceReference(PaymentIcons.class, "paypal.png"),
			new PackageResourceReference(PaymentIcons.class, "payu.png"),
			new PackageResourceReference(PaymentIcons.class, "prepay.png"),
			new PackageResourceReference(PaymentIcons.class, "sue.png"),
			new PackageResourceReference(PaymentIcons.class, "visa.png"),
			new PackageResourceReference(PaymentIcons.class, "cc.png"),
			new PackageResourceReference(PaymentIcons.class, "coll_store.png"),
			new PackageResourceReference(PaymentIcons.class, "cod.png"),
			new PackageResourceReference(PaymentIcons.class, "mcm.png"),
			new PackageResourceReference(PaymentIcons.class, "debit.png")
		);
		*/
//		ApplicationSpriteSupport.initialize(this);
//		ApplicationSpriteSupport.get().getSpriteRegistry().register(true,
//			new PackageResourceReference(Dummy.class, "de.png"),
//			new PackageResourceReference(Dummy.class, "gb.png"),
//			new PackageResourceReference(Dummy.class, "us.png")
//		);

		// --- mount pages ---
		// main pages
//		mountPage("foo", FooPage.class);
//		mountPage("bar/${id}", BarPage.class);
		// internal

		// mount Bootstrap fonts
		{
			final String[] bootstrapFontFiles = new String[] {
				"glyphicons-halflings-regular.eot", "glyphicons-halflings-regular.woff", "glyphicons-halflings-regular.ttf", "glyphicons-halflings-regular.svg",
			};
			for (final String fontFile : bootstrapFontFiles) {
				mountResource("/fonts/" + fontFile, new PackageResourceReference(AbstractApplicationPage.class, fontFile));
			}
		}
		
	}

	/* (non-Javadoc)
	 * @see org.apache.wicket.Application#getHomePage()
	 */
	@Override
	public Class<? extends Page> getHomePage() {
		return NavigationPage.class;
	}

	/* (non-Javadoc)
	 * @see org.apache.wicket.Application#getExceptionMapperProvider()
	 */
	@Override
	public IProvider<IExceptionMapper> getExceptionMapperProvider() {
		return new IProvider<IExceptionMapper>() {
			@Override
			public IExceptionMapper get() {
				return new WmcDemoExceptionMapper();
			}
		};
	}

}
