module com.seshop.liba {
	//com.seshop.libcに依存
	requires com.seshop.libc;
	//com.seshop.sample.firstpkgを公開
	exports com.seshop.sample.firstpkg;
}