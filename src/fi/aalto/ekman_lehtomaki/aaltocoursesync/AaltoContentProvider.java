package fi.aalto.ekman_lehtomaki.aaltocoursesync;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;

public class AaltoContentProvider extends ContentProvider {

	private static final String AUTHORITY =
			"fi.aalto.ekman_lehtomaki.aaltocoursesync.provider";
	public static final Uri URI = Uri.parse("content://" + AUTHORITY + "/");

	@Override
	public boolean onCreate() {
		return true;
	}

	@Override
	public String getType(Uri uri) {
		return null;
	}

	@Override
	public Cursor query(
			Uri uri,
			String[] projection,
			String selection,
			String[] selectionArgs,
			String sortOrder) {
		
		return null;
	}

	@Override
	public Uri insert(Uri uri, ContentValues values) {
		return null;
	}

	@Override
	public int delete(Uri uri, String selection, String[] selectionArgs) {
		return 0;
	}

	@Override
	public int update(
			Uri uri,
			ContentValues values,
			String selection,
			String[] selectionArgs) {
		
		return 0;
	}

}
